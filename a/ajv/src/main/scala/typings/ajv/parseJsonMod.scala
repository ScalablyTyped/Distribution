package typings.ajv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseJsonMod {
  
  object parseJson {
    
    inline def apply(s: String, pos: Double): Any = (^.asInstanceOf[js.Dynamic].apply(s.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSImport("ajv/dist/runtime/parseJson", "parseJson")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ajv/dist/runtime/parseJson", "parseJson.code")
    @js.native
    def code: String = js.native
    inline def code_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("code")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/runtime/parseJson", "parseJson.message")
    @js.native
    def message: js.UndefOr[String] = js.native
    inline def message_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("message")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/runtime/parseJson", "parseJson.position")
    @js.native
    def position: Double = js.native
    inline def position_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("position")(x.asInstanceOf[js.Any])
  }
  
  object parseJsonNumber {
    
    inline def apply(s: String, pos: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].apply(s.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
    inline def apply(s: String, pos: Double, maxDigits: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].apply(s.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], maxDigits.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
    
    @JSImport("ajv/dist/runtime/parseJson", "parseJsonNumber")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ajv/dist/runtime/parseJson", "parseJsonNumber.code")
    @js.native
    def code: String = js.native
    inline def code_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("code")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/runtime/parseJson", "parseJsonNumber.message")
    @js.native
    def message: js.UndefOr[String] = js.native
    inline def message_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("message")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/runtime/parseJson", "parseJsonNumber.position")
    @js.native
    def position: Double = js.native
    inline def position_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("position")(x.asInstanceOf[js.Any])
  }
  
  object parseJsonString {
    
    inline def apply(s: String, pos: Double): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(s.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    
    @JSImport("ajv/dist/runtime/parseJson", "parseJsonString")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ajv/dist/runtime/parseJson", "parseJsonString.code")
    @js.native
    def code: String = js.native
    inline def code_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("code")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/runtime/parseJson", "parseJsonString.message")
    @js.native
    def message: js.UndefOr[String] = js.native
    inline def message_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("message")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/runtime/parseJson", "parseJsonString.position")
    @js.native
    def position: Double = js.native
    inline def position_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("position")(x.asInstanceOf[js.Any])
  }
}
