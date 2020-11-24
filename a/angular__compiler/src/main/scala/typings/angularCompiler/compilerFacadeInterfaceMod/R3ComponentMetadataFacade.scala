package typings.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.Selector
import typings.angularCompiler.anon.UsesOnChanges
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait R3ComponentMetadataFacade extends R3DirectiveMetadataFacade {
  
  var animations: js.UndefOr[js.Array[_]] = js.native
  
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.native
  
  var directives: js.Array[Selector] = js.native
  
  var encapsulation: ViewEncapsulation = js.native
  
  var interpolation: js.UndefOr[js.Tuple2[String, String]] = js.native
  
  var pipes: Map[String, _] = js.native
  
  var preserveWhitespaces: Boolean = js.native
  
  var styles: js.Array[String] = js.native
  
  var template: String = js.native
  
  var viewProviders: js.Array[Provider] | Null = js.native
}
object R3ComponentMetadataFacade {
  
  @scala.inline
  def apply(
    directives: js.Array[Selector],
    encapsulation: ViewEncapsulation,
    host: StringDictionary[String],
    inputs: js.Array[String],
    lifecycle: UsesOnChanges,
    name: String,
    outputs: js.Array[String],
    pipes: Map[String, _],
    preserveWhitespaces: Boolean,
    propMetadata: StringDictionary[js.Array[_]],
    queries: js.Array[R3QueryMetadataFacade],
    styles: js.Array[String],
    template: String,
    `type`: js.Any,
    typeArgumentCount: Double,
    typeSourceSpan: ParseSourceSpan,
    usesInheritance: Boolean,
    viewQueries: js.Array[R3QueryMetadataFacade]
  ): R3ComponentMetadataFacade = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], encapsulation = encapsulation.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any], preserveWhitespaces = preserveWhitespaces.asInstanceOf[js.Any], propMetadata = propMetadata.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any], usesInheritance = usesInheritance.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3ComponentMetadataFacade]
  }
  
  @scala.inline
  implicit class R3ComponentMetadataFacadeOps[Self <: R3ComponentMetadataFacade] (val x: Self) extends AnyVal {
    
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
    def setDirectivesVarargs(value: Selector*): Self = this.set("directives", js.Array(value :_*))
    
    @scala.inline
    def setDirectives(value: js.Array[Selector]): Self = this.set("directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncapsulation(value: ViewEncapsulation): Self = this.set("encapsulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipes(value: Map[String, _]): Self = this.set("pipes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveWhitespaces(value: Boolean): Self = this.set("preserveWhitespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: String*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[String]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationsVarargs(value: js.Any*): Self = this.set("animations", js.Array(value :_*))
    
    @scala.inline
    def setAnimations(value: js.Array[_]): Self = this.set("animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimations: Self = this.set("animations", js.undefined)
    
    @scala.inline
    def setChangeDetection(value: ChangeDetectionStrategy): Self = this.set("changeDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeDetection: Self = this.set("changeDetection", js.undefined)
    
    @scala.inline
    def setInterpolation(value: js.Tuple2[String, String]): Self = this.set("interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolation: Self = this.set("interpolation", js.undefined)
    
    @scala.inline
    def setViewProvidersVarargs(value: Provider*): Self = this.set("viewProviders", js.Array(value :_*))
    
    @scala.inline
    def setViewProviders(value: js.Array[Provider]): Self = this.set("viewProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewProvidersNull: Self = this.set("viewProviders", null)
  }
}
