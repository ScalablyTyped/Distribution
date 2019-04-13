package typings
package adlibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object adlibMod {
  type TransformFunction = js.Function4[
    /* key */ java.lang.String, 
    /* value */ js.Any, 
    /* settings */ js.Any, 
    /* param */ js.UndefOr[js.Any], 
    js.Any
  ]
  type TransformsList = org.scalablytyped.runtime.StringDictionary[TransformFunction]
}
