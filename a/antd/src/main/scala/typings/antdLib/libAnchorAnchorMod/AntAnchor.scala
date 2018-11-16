package typings
package antdLib.libAnchorAnchorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AntAnchor extends js.Object {
  var activeLink: java.lang.String | scala.Null
  var onClick: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
      /* link */ antdLib.Anon_Href, 
      scala.Unit
    ]
  ] = js.undefined
  def registerLink(link: java.lang.String): scala.Unit
  def scrollTo(link: java.lang.String): scala.Unit
  def unregisterLink(link: java.lang.String): scala.Unit
}

