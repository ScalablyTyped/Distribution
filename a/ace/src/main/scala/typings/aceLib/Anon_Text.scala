package typings
package aceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Text
  extends org.scalablytyped.runtime.Instantiable2[
      (/* text */ js.Array[java.lang.String]) | (/* text */ java.lang.String), 
      (/* mode */ java.lang.String) | (/* mode */ aceLib.AceAjaxNs.TextMode), 
      aceLib.AceAjaxNs.IEditSession
    ]
     with /**
  * Sets up a new `EditSession` and associates it with the given `Document` and `TextMode`.
  * @param text [If `text` is a `Document`, it associates the `EditSession` with it. Otherwise, a new `Document` is created, with the initial text]{: #textParam}
  * @param mode [The inital language mode to use for the document]{: #modeParam}
  **/
org.scalablytyped.runtime.Instantiable1[
      (/* text */ js.Array[java.lang.String]) | (/* text */ java.lang.String), 
      aceLib.AceAjaxNs.IEditSession
    ]

