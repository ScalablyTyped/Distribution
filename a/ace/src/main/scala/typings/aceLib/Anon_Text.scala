package typings
package aceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Text
  extends /**
         * Sets up a new `EditSession` and associates it with the given `Document` and `TextMode`.
         * @param text [If `text` is a `Document`, it associates the `EditSession` with it. Otherwise, a new `Document` is created, with the initial text]{: #textParam}
         * @param mode [The inital language mode to use for the document]{: #modeParam}
        **/
ScalablyTyped.runtime.Instantiable1[
      (/* text */ java.lang.String) | (/* text */ js.Array[java.lang.String]), 
      aceLib.AceAjaxNs.IEditSession
    ]
     with /**
         * Sets up a new `EditSession` and associates it with the given `Document` and `TextMode`.
         * @param text [If `text` is a `Document`, it associates the `EditSession` with it. Otherwise, a new `Document` is created, with the initial text]{: #textParam}
         * @param mode [The inital language mode to use for the document]{: #modeParam}
        **/
ScalablyTyped.runtime.Instantiable2[
      (/* text */ java.lang.String) | (/* text */ js.Array[java.lang.String]), 
      (/* mode */ aceLib.AceAjaxNs.TextMode) | (/* mode */ java.lang.String), 
      aceLib.AceAjaxNs.IEditSession
    ]

