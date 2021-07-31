package typings.angularCore

import typings.angularCore.anon.Character
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Node
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngComponentTemplateMod {
  
  @JSImport("@angular/core/schematics/utils/ng_component_template", "NgComponentTemplateVisitor")
  @js.native
  class NgComponentTemplateVisitor protected () extends StObject {
    def this(typeChecker: TypeChecker) = this()
    
    var resolvedTemplates: js.Array[ResolvedTemplate] = js.native
    
    var typeChecker: TypeChecker = js.native
    
    var visitClassDeclaration: js.Any = js.native
    
    def visitNode(node: Node): Unit = js.native
  }
  
  trait ResolvedTemplate extends StObject {
    
    /** Class declaration that contains this template. */
    var container: ClassDeclaration
    
    /** File content of the given template. */
    var content: String
    
    /** Path to the file that contains this template. */
    var filePath: String
    
    /**
      * Gets the character and line of a given position index in the template.
      * If the template is declared inline within a TypeScript source file, the line and
      * character are based on the full source file content.
      */
    def getCharacterAndLineOfPosition(pos: Double): Character
    
    /** Whether the given template is inline or not. */
    var `inline`: Boolean
    
    /** Start offset of the template content (e.g. in the inline source file) */
    var start: Double
  }
  object ResolvedTemplate {
    
    @scala.inline
    def apply(
      container: ClassDeclaration,
      content: String,
      filePath: String,
      getCharacterAndLineOfPosition: Double => Character,
      `inline`: Boolean,
      start: Double
    ): ResolvedTemplate = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], getCharacterAndLineOfPosition = js.Any.fromFunction1(getCharacterAndLineOfPosition), start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedTemplate]
    }
    
    @scala.inline
    implicit class ResolvedTemplateMutableBuilder[Self <: ResolvedTemplate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: ClassDeclaration): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetCharacterAndLineOfPosition(value: Double => Character): Self = StObject.set(x, "getCharacterAndLineOfPosition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
