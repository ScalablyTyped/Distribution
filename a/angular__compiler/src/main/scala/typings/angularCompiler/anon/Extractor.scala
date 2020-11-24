package typings.angularCompiler.anon

import typings.angularCompiler.staticReflectorMod.StaticReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extractor extends js.Object {
  
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
  implicit class ExtractorOps[Self <: Extractor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExtractor(value: typings.angularCompiler.extractorMod.Extractor): Self = this.set("extractor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticReflector(value: StaticReflector): Self = this.set("staticReflector", value.asInstanceOf[js.Any])
  }
}
