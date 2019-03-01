package typings
package antdLib.libAnchorAnchorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntAnchor extends js.Object {
  var activeLink: java.lang.String | scala.Null
  var onClick: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
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
    registerLink: js.Function1[java.lang.String, scala.Unit],
    scrollTo: js.Function1[java.lang.String, scala.Unit],
    unregisterLink: js.Function1[java.lang.String, scala.Unit],
    activeLink: java.lang.String = null,
    onClick: js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* link */ antdLib.Anon_Href, 
      scala.Unit
    ] = null
  ): AntAnchor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("registerLink")(registerLink)
    __obj.updateDynamic("scrollTo")(scrollTo)
    __obj.updateDynamic("unregisterLink")(unregisterLink)
    if (activeLink != null) __obj.updateDynamic("activeLink")(activeLink)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[AntAnchor]
  }
}

