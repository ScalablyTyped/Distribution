package typings.antd

import typings.antd.libUtilTypeMod.ElementOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilColorsMod {
  
  @JSImport("antd/lib/_util/colors", "PresetColorTypes")
  @js.native
  val PresetColorTypes: js.Tuple13[
    "pink", 
    "red", 
    "yellow", 
    "orange", 
    "cyan", 
    "green", 
    "blue", 
    "purple", 
    "geekblue", 
    "magenta", 
    "volcano", 
    "gold", 
    "lime"
  ] = js.native
  
  @JSImport("antd/lib/_util/colors", "PresetStatusColorTypes")
  @js.native
  val PresetStatusColorTypes: js.Tuple5["success", "processing", "error", "default", "warning"] = js.native
  
  type PresetColorType = ElementOf[
    js.Tuple13[
      "pink", 
      "red", 
      "yellow", 
      "orange", 
      "cyan", 
      "green", 
      "blue", 
      "purple", 
      "geekblue", 
      "magenta", 
      "volcano", 
      "gold", 
      "lime"
    ]
  ]
  
  type PresetStatusColorType = ElementOf[js.Tuple5["success", "processing", "error", "default", "warning"]]
}
