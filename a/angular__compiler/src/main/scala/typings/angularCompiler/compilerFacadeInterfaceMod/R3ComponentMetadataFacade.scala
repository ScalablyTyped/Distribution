package typings.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.Selector
import typings.angularCompiler.anon.UsesOnChanges
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3ComponentMetadataFacade
  extends StObject
     with R3DirectiveMetadataFacade {
  
  var animations: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.undefined
  
  var directives: js.Array[Selector]
  
  var encapsulation: ViewEncapsulation
  
  var interpolation: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  
  var pipes: Map[String, js.Any]
  
  var preserveWhitespaces: Boolean
  
  var styles: js.Array[String]
  
  var template: String
  
  var viewProviders: js.Array[Provider] | Null
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
    pipes: Map[String, js.Any],
    preserveWhitespaces: Boolean,
    propMetadata: StringDictionary[js.Array[js.Any]],
    queries: js.Array[R3QueryMetadataFacade],
    styles: js.Array[String],
    template: String,
    `type`: js.Any,
    typeArgumentCount: Double,
    typeSourceSpan: ParseSourceSpan,
    usesInheritance: Boolean,
    viewQueries: js.Array[R3QueryMetadataFacade]
  ): R3ComponentMetadataFacade = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], encapsulation = encapsulation.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any], preserveWhitespaces = preserveWhitespaces.asInstanceOf[js.Any], propMetadata = propMetadata.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any], usesInheritance = usesInheritance.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any], deps = null, exportAs = null, providers = null, selector = null, viewProviders = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3ComponentMetadataFacade]
  }
  
  @scala.inline
  implicit class R3ComponentMetadataFacadeMutableBuilder[Self <: R3ComponentMetadataFacade] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimations(value: js.Array[js.Any]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
    
    @scala.inline
    def setAnimationsVarargs(value: js.Any*): Self = StObject.set(x, "animations", js.Array(value :_*))
    
    @scala.inline
    def setChangeDetection(value: ChangeDetectionStrategy): Self = StObject.set(x, "changeDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeDetectionUndefined: Self = StObject.set(x, "changeDetection", js.undefined)
    
    @scala.inline
    def setDirectives(value: js.Array[Selector]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectivesVarargs(value: Selector*): Self = StObject.set(x, "directives", js.Array(value :_*))
    
    @scala.inline
    def setEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolation(value: js.Tuple2[String, String]): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    @scala.inline
    def setPipes(value: Map[String, js.Any]): Self = StObject.set(x, "pipes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewProviders(value: js.Array[Provider]): Self = StObject.set(x, "viewProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewProvidersNull: Self = StObject.set(x, "viewProviders", null)
    
    @scala.inline
    def setViewProvidersVarargs(value: Provider*): Self = StObject.set(x, "viewProviders", js.Array(value :_*))
  }
}
