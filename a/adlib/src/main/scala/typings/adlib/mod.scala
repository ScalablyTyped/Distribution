package typings.adlib

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adlib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def adlib(template: js.Any, settings: js.Any): js.Any = js.native
  def adlib(template: js.Any, settings: js.Any, transforms: TransformsList): js.Any = js.native
  def listDependencies(template: js.Any): js.Array[String] = js.native
  type TransformFunction = js.Function4[
    /* key */ String, 
    /* value */ js.Any, 
    /* settings */ js.Any, 
    /* param */ js.UndefOr[js.Any], 
    js.Any
  ]
  type TransformsList = StringDictionary[TransformFunction]
}

