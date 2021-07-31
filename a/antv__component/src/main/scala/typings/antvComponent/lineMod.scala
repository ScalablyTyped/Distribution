package typings.antvComponent

import typings.antvComponent.typesMod.LineAnnotationCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineMod {
  
  @JSImport("@antv/component/lib/annotation/line", JSImport.Default)
  @js.native
  class default () extends LineAnnotation
  
  @js.native
  trait LineAnnotation
    extends typings.antvComponent.groupComponentMod.default[LineAnnotationCfg] {
    
    var getLabelPoint: js.Any = js.native
    
    var renderLabel: js.Any = js.native
    
    var renderLine: js.Any = js.native
  }
}
