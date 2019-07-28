package typings.autolinker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SchemeMatches extends js.Object {
  var schemeMatches: Boolean
  var tldMatches: Boolean
  var wwwMatches: Boolean
}

object Anon_SchemeMatches {
  @scala.inline
  def apply(schemeMatches: Boolean, tldMatches: Boolean, wwwMatches: Boolean): Anon_SchemeMatches = {
    val __obj = js.Dynamic.literal(schemeMatches = schemeMatches, tldMatches = tldMatches, wwwMatches = wwwMatches)
  
    __obj.asInstanceOf[Anon_SchemeMatches]
  }
}

