package typings.angularCompilerCli

import typings.angularCompiler.mod.BoundTarget
import typings.angularCompiler.mod.DirectiveMeta
import typings.angularCompiler.mod.InputOutputPropertySet
import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.anon.IsInline
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscIndexerSrcContextMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/indexer/src/context", "IndexingContext")
  @js.native
  open class IndexingContext () extends StObject {
    
    /**
      * Adds a component to the context.
      */
    def addComponent(info: ComponentInfo): Unit = js.native
    
    val components: Set[ComponentInfo] = js.native
  }
  
  trait ComponentInfo extends StObject {
    
    /**
      * BoundTarget containing the parsed template. Can also be used to query for directives used in
      * the template.
      */
    var boundTemplate: BoundTarget[ComponentMeta]
    
    /** Component TypeScript class declaration */
    var declaration: ClassDeclarationDeclarati
    
    /** Component template selector if it exists, otherwise null. */
    var selector: String | Null
    
    /** Metadata about the template */
    var templateMeta: IsInline
  }
  object ComponentInfo {
    
    inline def apply(
      boundTemplate: BoundTarget[ComponentMeta],
      declaration: ClassDeclarationDeclarati,
      templateMeta: IsInline
    ): ComponentInfo = {
      val __obj = js.Dynamic.literal(boundTemplate = boundTemplate.asInstanceOf[js.Any], declaration = declaration.asInstanceOf[js.Any], templateMeta = templateMeta.asInstanceOf[js.Any], selector = null)
      __obj.asInstanceOf[ComponentInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentInfo] (val x: Self) extends AnyVal {
      
      inline def setBoundTemplate(value: BoundTarget[ComponentMeta]): Self = StObject.set(x, "boundTemplate", value.asInstanceOf[js.Any])
      
      inline def setDeclaration(value: ClassDeclarationDeclarati): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorNull: Self = StObject.set(x, "selector", null)
      
      inline def setTemplateMeta(value: IsInline): Self = StObject.set(x, "templateMeta", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentMeta
    extends StObject
       with DirectiveMeta {
    
    var ref: Reference[ClassDeclarationDeclarati]
  }
  object ComponentMeta {
    
    inline def apply(
      inputs: InputOutputPropertySet,
      isComponent: Boolean,
      isStructural: Boolean,
      name: String,
      outputs: InputOutputPropertySet,
      ref: Reference[ClassDeclarationDeclarati]
    ): ComponentMeta = {
      val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], animationTriggerNames = null, exportAs = null, selector = null)
      __obj.asInstanceOf[ComponentMeta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentMeta] (val x: Self) extends AnyVal {
      
      inline def setRef(value: Reference[ClassDeclarationDeclarati]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
}
