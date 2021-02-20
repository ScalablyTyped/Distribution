package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.outputAstMod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapUtilMod {
  
  @JSImport("@angular/compiler/src/output/map_util", "mapEntry")
  @js.native
  def mapEntry(key: String, value: Expression): MapEntry_ = js.native
  
  @JSImport("@angular/compiler/src/output/map_util", "mapLiteral")
  @js.native
  def mapLiteral(obj: StringDictionary[Expression]): Expression = js.native
  @JSImport("@angular/compiler/src/output/map_util", "mapLiteral")
  @js.native
  def mapLiteral(obj: StringDictionary[Expression], quoted: Boolean): Expression = js.native
  
  @js.native
  trait MapEntry_ extends StObject {
    
    var key: String = js.native
    
    var quoted: Boolean = js.native
    
    var value: Expression = js.native
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
