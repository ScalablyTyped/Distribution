package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.outputAstMod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapUtilMod {
  
  @JSImport("@angular/compiler/src/output/map_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def mapEntry(key: String, value: Expression): MapEntry_ = (^.asInstanceOf[js.Dynamic].applyDynamic("mapEntry")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[MapEntry_]
  
  @scala.inline
  def mapLiteral(obj: StringDictionary[Expression]): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLiteral")(obj.asInstanceOf[js.Any]).asInstanceOf[Expression]
  @scala.inline
  def mapLiteral(obj: StringDictionary[Expression], quoted: Boolean): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("mapLiteral")(obj.asInstanceOf[js.Any], quoted.asInstanceOf[js.Any])).asInstanceOf[Expression]
  
  trait MapEntry_ extends StObject {
    
    var key: String
    
    var quoted: Boolean
    
    var value: Expression
  }
  object MapEntry_ {
    
    @scala.inline
    def apply(key: String, quoted: Boolean, value: Expression): MapEntry_ = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapEntry_]
    }
    
    @scala.inline
    implicit class MapEntry_MutableBuilder[Self <: MapEntry_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoted(value: Boolean): Self = StObject.set(x, "quoted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type MapLiteral_ = js.Array[MapEntry_]
}
