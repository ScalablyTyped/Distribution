package typings.angularCore

import typings.typescript.mod.CallExpression
import typings.typescript.mod.Decorator
import typings.typescript.mod.ImportDeclaration
import typings.typescript.mod.LeftHandSideExpression
import typings.typescript.mod.ModifiersArray
import typings.typescript.mod.NamedDeclaration
import typings.typescript.mod.Node
import typings.typescript.mod.NodeArray
import typings.typescript.mod.NodeFlags
import typings.typescript.mod.SourceFile
import typings.typescript.mod.SourceFileLike
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngDecoratorsMod {
  
  @JSImport("@angular/core/schematics/utils/ng_decorators", "getAngularDecorators")
  @js.native
  def getAngularDecorators(typeChecker: TypeChecker, decorators: js.Array[Decorator]): js.Array[NgDecorator] = js.native
  
  /* Inlined typescript.typescript.Decorator & {  expression :typescript.typescript.CallExpression} */
  @js.native
  trait CallExpressionDecorator extends StObject {
    
    val decorators: js.UndefOr[NodeArray[Decorator]] = js.native
    
    val end: Double = js.native
    
    val expression: LeftHandSideExpression with CallExpression = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: js.UndefOr[scala.Nothing], includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    val kind: typings.typescript.mod.SyntaxKind.Decorator = js.native
    
    val modifiers: js.UndefOr[ModifiersArray] = js.native
    
    val parent: NamedDeclaration = js.native
    
    val pos: Double = js.native
  }
  
  @js.native
  trait NgDecorator extends StObject {
    
    var importNode: ImportDeclaration = js.native
    
    var moduleName: String = js.native
    
    var name: String = js.native
    
    var node: CallExpressionDecorator = js.native
  }
  object NgDecorator {
    
    @scala.inline
    def apply(importNode: ImportDeclaration, moduleName: String, name: String, node: CallExpressionDecorator): NgDecorator = {
      val __obj = js.Dynamic.literal(importNode = importNode.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NgDecorator]
    }
    
    @scala.inline
    implicit class NgDecoratorMutableBuilder[Self <: NgDecorator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImportNode(value: ImportDeclaration): Self = StObject.set(x, "importNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: CallExpressionDecorator): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
}
