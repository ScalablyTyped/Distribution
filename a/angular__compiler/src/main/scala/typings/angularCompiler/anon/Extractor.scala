package typings.angularCompiler.anon

import typings.angularCompiler.staticReflectorMod.StaticReflector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extractor extends StObject {
  
  var extractor: typings.angularCompiler.extractorMod.Extractor = js.native
  
  var staticReflector: StaticReflector = js.native
}
object Extractor {
  
  @scala.inline
  def apply(extractor: typings.angularCompiler.extractorMod.Extractor, staticReflector: StaticReflector): Extractor = {
    val __obj = js.Dynamic.literal(extractor = extractor.asInstanceOf[js.Any], staticReflector = staticReflector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extractor]
  }
  
  @scala.inline
  implicit class ExtractorMutableBuilder[Self <: Extractor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtractor(value: typings.angularCompiler.extractorMod.Extractor): Self = StObject.set(x, "extractor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticReflector(value: StaticReflector): Self = StObject.set(x, "staticReflector", value.asInstanceOf[js.Any])
  }
}
