package typings.antvGLite

import typings.antvGLite.filterMod.ParsedFilterStyleProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csspropertyfilterMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<std.Array<@antv/g-lite.@antv/g-lite/dist/css/parser/filter.ParsedFilterStyleProperty>, std.Array<@antv/g-lite.@antv/g-lite/dist/css/parser/filter.ParsedFilterStyleProperty>> ]:? @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<std.Array<@antv/g-lite.@antv/g-lite/dist/css/parser/filter.ParsedFilterStyleProperty>, std.Array<@antv/g-lite.@antv/g-lite/dist/css/parser/filter.ParsedFilterStyleProperty>>[P]} */ @JSImport("@antv/g-lite/dist/css/properties/CSSPropertyFilter", "CSSPropertyFilter")
  @js.native
  open class CSSPropertyFilter () extends StObject {
    
    def calculator(
      name: String,
      oldParsed: js.Array[ParsedFilterStyleProperty],
      parsed: js.Array[ParsedFilterStyleProperty]
    ): js.Array[ParsedFilterStyleProperty] = js.native
    
    def parser(): js.Array[ParsedFilterStyleProperty] = js.native
    def parser(filterStr: String): js.Array[ParsedFilterStyleProperty] = js.native
    @JSName("parser")
    var parser_Original: js.Function1[/* filterStr */ js.UndefOr[String], js.Array[ParsedFilterStyleProperty]] = js.native
  }
}
