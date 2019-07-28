package typings.angularDashSanitize.angularDashSanitizeMod.angularMod.sanitizeNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object filterNs {
  /**
    * Finds links in text input and turns them into html links. Supports http/https/ftp/mailto and plain email address links.
    * @see https://code.angularjs.org/1.7.0/docs/api/ngSanitize/filter/linky
    * @param text Input text.
    * @param target ILinkyTargetType Window (_blank|_self|_parent|_top) or named frame to open links in.
    * @param attributes Add custom attributes to the link element.
    * @return Html-linkified and sanitized text.
    */
  type ILinky = js.Function3[
    /* text */ String, 
    /* target */ js.UndefOr[String], 
    /* attributes */ js.UndefOr[
      StringDictionary[String] | (js.Function1[/* url */ String, StringDictionary[String]])
    ], 
    String
  ]
}
