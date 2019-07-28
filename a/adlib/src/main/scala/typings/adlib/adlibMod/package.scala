package typings.adlib

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object adlibMod {
  type TransformFunction = js.Function4[
    /* key */ String, 
    /* value */ js.Any, 
    /* settings */ js.Any, 
    /* param */ js.UndefOr[js.Any], 
    js.Any
  ]
  type TransformsList = StringDictionary[TransformFunction]
}
