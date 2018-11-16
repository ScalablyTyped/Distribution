package typings
package angularDashSanitizeLib.angularDashSanitizeMod.angularMod.sanitizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object filterNs {
  /**
               * Finds links in text input and turns them into html links. Supports http/https/ftp/mailto and plain email address links.
               * @param text Input text.
               * @param target ILinkyTargetType Window (_blank|_self|_parent|_top) or named frame to open links in.
               * @param attributes Add custom attributes to the link element.
               * @return Html-linkified and sanitized text.
               * see https://docs.angularjs.org/api/ngSanitize/filter/linky
               */
  type ILinky = js.Function3[
    /* text */ java.lang.String, 
    /* target */ js.UndefOr[java.lang.String], 
    /* attributes */ js.UndefOr[
      ScalablyTyped.runtime.StringDictionary[java.lang.String] | (js.Function1[
        /* url */ java.lang.String, 
        ScalablyTyped.runtime.StringDictionary[java.lang.String]
      ])
    ], 
    java.lang.String
  ]
}
