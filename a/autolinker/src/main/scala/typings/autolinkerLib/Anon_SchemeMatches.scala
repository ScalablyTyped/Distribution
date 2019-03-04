package typings
package autolinkerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SchemeMatches extends js.Object {
  var schemeMatches: scala.Boolean
  var tldMatches: scala.Boolean
  var wwwMatches: scala.Boolean
}

object Anon_SchemeMatches {
  @scala.inline
  def apply(schemeMatches: scala.Boolean, tldMatches: scala.Boolean, wwwMatches: scala.Boolean): Anon_SchemeMatches = {
    val __obj = js.Dynamic.literal(schemeMatches = schemeMatches, tldMatches = tldMatches, wwwMatches = wwwMatches)
  
    __obj.asInstanceOf[Anon_SchemeMatches]
  }
}

