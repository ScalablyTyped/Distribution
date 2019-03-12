package typings
package antdLib.libAnchorAnchorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntAnchor extends js.Object {
  var activeLink: java.lang.String | scala.Null
  var onClick: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* link */ antdLib.Anon_Href, 
      scala.Unit
    ]
  ] = js.undefined
  def registerLink(link: java.lang.String): scala.Unit
  def scrollTo(link: java.lang.String): scala.Unit
  def unregisterLink(link: java.lang.String): scala.Unit
}

object AntAnchor {
  @scala.inline
  def apply(
    registerLink: java.lang.String => scala.Unit,
    scrollTo: java.lang.String => scala.Unit,
    unregisterLink: java.lang.String => scala.Unit,
    activeLink: java.lang.String = null,
    onClick: (/* e */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* link */ antdLib.Anon_Href) => scala.Unit = null
  ): AntAnchor = {
    val __obj = js.Dynamic.literal(registerLink = js.Any.fromFunction1(registerLink), scrollTo = js.Any.fromFunction1(scrollTo), unregisterLink = js.Any.fromFunction1(unregisterLink))
    if (activeLink != null) __obj.updateDynamic("activeLink")(activeLink)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    __obj.asInstanceOf[AntAnchor]
  }
}

