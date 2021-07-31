package typings.astring

import typings.astring.anon.FnCall
import typings.astring.anon.OptionsoutputStream
import typings.astring.anon.Type
import typings.astring.anon.Write
import typings.astring.anon.`0`
import typings.astring.anon.`10`
import typings.astring.anon.`11`
import typings.astring.anon.`12`
import typings.astring.anon.`13`
import typings.astring.anon.`14`
import typings.astring.anon.`15`
import typings.astring.anon.`16`
import typings.astring.anon.`17`
import typings.astring.anon.`18`
import typings.astring.anon.`19`
import typings.astring.anon.`1`
import typings.astring.anon.`20`
import typings.astring.anon.`21`
import typings.astring.anon.`22`
import typings.astring.anon.`23`
import typings.astring.anon.`24`
import typings.astring.anon.`25`
import typings.astring.anon.`26`
import typings.astring.anon.`27`
import typings.astring.anon.`28`
import typings.astring.anon.`29`
import typings.astring.anon.`2`
import typings.astring.anon.`30`
import typings.astring.anon.`31`
import typings.astring.anon.`32`
import typings.astring.anon.`33`
import typings.astring.anon.`34`
import typings.astring.anon.`35`
import typings.astring.anon.`36`
import typings.astring.anon.`37`
import typings.astring.anon.`38`
import typings.astring.anon.`39`
import typings.astring.anon.`3`
import typings.astring.anon.`40`
import typings.astring.anon.`41`
import typings.astring.anon.`42`
import typings.astring.anon.`43`
import typings.astring.anon.`44`
import typings.astring.anon.`45`
import typings.astring.anon.`46`
import typings.astring.anon.`47`
import typings.astring.anon.`48`
import typings.astring.anon.`49`
import typings.astring.anon.`4`
import typings.astring.anon.`50`
import typings.astring.anon.`51`
import typings.astring.anon.`52`
import typings.astring.anon.`53`
import typings.astring.anon.`54`
import typings.astring.anon.`55`
import typings.astring.anon.`56`
import typings.astring.anon.`57`
import typings.astring.anon.`58`
import typings.astring.anon.`59`
import typings.astring.anon.`5`
import typings.astring.anon.`60`
import typings.astring.anon.`61`
import typings.astring.anon.`62`
import typings.astring.anon.`63`
import typings.astring.anon.`64`
import typings.astring.anon.`65`
import typings.astring.anon.`66`
import typings.astring.anon.`6`
import typings.astring.anon.`7`
import typings.astring.anon.`8`
import typings.astring.anon.`9`
import typings.estree.mod.Node
import typings.node.streamMod.Stream
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("astring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("astring", "baseGenerator")
  @js.native
  val baseGenerator: Generator = js.native
  
  @scala.inline
  def generate(node: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def generate(node: Node, options: OptionsoutputStream): Stream = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Stream]
  @scala.inline
  def generate(node: Node, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object global {
    
    trait astring extends StObject {
      
      /** Base generator that can be used to extend Astring. See https://github.com/davidbonnet/astring#extending */
      var baseGenerator: Generator
      
      def generate(node: Node): String
      def generate(node: Node, options: OptionsoutputStream): Stream
      def generate(node: Node, options: Options): String
      @JSName("generate")
      var generate_Original: FnCall
    }
    object astring {
      
      @JSGlobal("astring")
      @js.native
      val ^ : typings.astring.mod.global.astring = js.native
      
      @scala.inline
      implicit class astringMutableBuilder[Self <: typings.astring.mod.global.astring] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBaseGenerator(value: Generator): Self = StObject.set(x, "baseGenerator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGenerate(value: FnCall): Self = StObject.set(x, "generate", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* Inlined {[ key in estree.estree.Node['type'] ]: (node : std.Extract<estree.estree.Node, {  type :key}>, state : {write (s : string): void}): void} */
  trait Generator extends StObject {
    
    def ArrayExpression(node: Extract[Node, `17`], state: Write): Unit
    @JSName("ArrayExpression")
    var ArrayExpression_Original: js.Function2[/* node */ Extract[Node, `17`], /* state */ Write, Unit]
    
    def ArrayPattern(node: Extract[Node, `37`], state: Write): Unit
    @JSName("ArrayPattern")
    var ArrayPattern_Original: js.Function2[/* node */ Extract[Node, `37`], /* state */ Write, Unit]
    
    def ArrowFunctionExpression(node: Extract[Node, `46`], state: Write): Unit
    @JSName("ArrowFunctionExpression")
    var ArrowFunctionExpression_Original: js.Function2[/* node */ Extract[Node, `46`], /* state */ Write, Unit]
    
    def AssignmentExpression(node: Extract[Node, `41`], state: Write): Unit
    @JSName("AssignmentExpression")
    var AssignmentExpression_Original: js.Function2[/* node */ Extract[Node, `41`], /* state */ Write, Unit]
    
    def AssignmentPattern(node: Extract[Node, `21`], state: Write): Unit
    @JSName("AssignmentPattern")
    var AssignmentPattern_Original: js.Function2[/* node */ Extract[Node, `21`], /* state */ Write, Unit]
    
    def AwaitExpression(node: Extract[Node, `35`], state: Write): Unit
    @JSName("AwaitExpression")
    var AwaitExpression_Original: js.Function2[/* node */ Extract[Node, `35`], /* state */ Write, Unit]
    
    def BinaryExpression(node: Extract[Node, `29`], state: Write): Unit
    @JSName("BinaryExpression")
    var BinaryExpression_Original: js.Function2[/* node */ Extract[Node, `29`], /* state */ Write, Unit]
    
    def BlockStatement(node: Extract[Node, `7`], state: Write): Unit
    @JSName("BlockStatement")
    var BlockStatement_Original: js.Function2[/* node */ Extract[Node, `7`], /* state */ Write, Unit]
    
    def BreakStatement(node: Extract[Node, `0`], state: Write): Unit
    @JSName("BreakStatement")
    var BreakStatement_Original: js.Function2[/* node */ Extract[Node, `0`], /* state */ Write, Unit]
    
    def CallExpression(node: Extract[Node, `15`], state: Write): Unit
    @JSName("CallExpression")
    var CallExpression_Original: js.Function2[/* node */ Extract[Node, `15`], /* state */ Write, Unit]
    
    def CatchClause(node: Extract[Node, `54`], state: Write): Unit
    @JSName("CatchClause")
    var CatchClause_Original: js.Function2[/* node */ Extract[Node, `54`], /* state */ Write, Unit]
    
    def ChainExpression(node: Extract[Node, `60`], state: Write): Unit
    @JSName("ChainExpression")
    var ChainExpression_Original: js.Function2[/* node */ Extract[Node, `60`], /* state */ Write, Unit]
    
    def ClassBody(node: Extract[Node, `63`], state: Write): Unit
    @JSName("ClassBody")
    var ClassBody_Original: js.Function2[/* node */ Extract[Node, `63`], /* state */ Write, Unit]
    
    def ClassDeclaration(node: Extract[Node, `34`], state: Write): Unit
    @JSName("ClassDeclaration")
    var ClassDeclaration_Original: js.Function2[/* node */ Extract[Node, `34`], /* state */ Write, Unit]
    
    def ClassExpression(node: Extract[Node, Type], state: Write): Unit
    @JSName("ClassExpression")
    var ClassExpression_Original: js.Function2[/* node */ Extract[Node, Type], /* state */ Write, Unit]
    
    def ConditionalExpression(node: Extract[Node, `52`], state: Write): Unit
    @JSName("ConditionalExpression")
    var ConditionalExpression_Original: js.Function2[/* node */ Extract[Node, `52`], /* state */ Write, Unit]
    
    def ContinueStatement(node: Extract[Node, `12`], state: Write): Unit
    @JSName("ContinueStatement")
    var ContinueStatement_Original: js.Function2[/* node */ Extract[Node, `12`], /* state */ Write, Unit]
    
    def DebuggerStatement(node: Extract[Node, `43`], state: Write): Unit
    @JSName("DebuggerStatement")
    var DebuggerStatement_Original: js.Function2[/* node */ Extract[Node, `43`], /* state */ Write, Unit]
    
    def DoWhileStatement(node: Extract[Node, `59`], state: Write): Unit
    @JSName("DoWhileStatement")
    var DoWhileStatement_Original: js.Function2[/* node */ Extract[Node, `59`], /* state */ Write, Unit]
    
    def EmptyStatement(node: Extract[Node, `33`], state: Write): Unit
    @JSName("EmptyStatement")
    var EmptyStatement_Original: js.Function2[/* node */ Extract[Node, `33`], /* state */ Write, Unit]
    
    def ExportAllDeclaration(node: Extract[Node, `10`], state: Write): Unit
    @JSName("ExportAllDeclaration")
    var ExportAllDeclaration_Original: js.Function2[/* node */ Extract[Node, `10`], /* state */ Write, Unit]
    
    def ExportDefaultDeclaration(node: Extract[Node, `26`], state: Write): Unit
    @JSName("ExportDefaultDeclaration")
    var ExportDefaultDeclaration_Original: js.Function2[/* node */ Extract[Node, `26`], /* state */ Write, Unit]
    
    def ExportNamedDeclaration(node: Extract[Node, `14`], state: Write): Unit
    @JSName("ExportNamedDeclaration")
    var ExportNamedDeclaration_Original: js.Function2[/* node */ Extract[Node, `14`], /* state */ Write, Unit]
    
    def ExportSpecifier(node: Extract[Node, `38`], state: Write): Unit
    @JSName("ExportSpecifier")
    var ExportSpecifier_Original: js.Function2[/* node */ Extract[Node, `38`], /* state */ Write, Unit]
    
    def ExpressionStatement(node: Extract[Node, `20`], state: Write): Unit
    @JSName("ExpressionStatement")
    var ExpressionStatement_Original: js.Function2[/* node */ Extract[Node, `20`], /* state */ Write, Unit]
    
    def ForInStatement(node: Extract[Node, `3`], state: Write): Unit
    @JSName("ForInStatement")
    var ForInStatement_Original: js.Function2[/* node */ Extract[Node, `3`], /* state */ Write, Unit]
    
    def ForOfStatement(node: Extract[Node, `51`], state: Write): Unit
    @JSName("ForOfStatement")
    var ForOfStatement_Original: js.Function2[/* node */ Extract[Node, `51`], /* state */ Write, Unit]
    
    def ForStatement(node: Extract[Node, `56`], state: Write): Unit
    @JSName("ForStatement")
    var ForStatement_Original: js.Function2[/* node */ Extract[Node, `56`], /* state */ Write, Unit]
    
    def FunctionDeclaration(node: Extract[Node, `42`], state: Write): Unit
    @JSName("FunctionDeclaration")
    var FunctionDeclaration_Original: js.Function2[/* node */ Extract[Node, `42`], /* state */ Write, Unit]
    
    def FunctionExpression(node: Extract[Node, `57`], state: Write): Unit
    @JSName("FunctionExpression")
    var FunctionExpression_Original: js.Function2[/* node */ Extract[Node, `57`], /* state */ Write, Unit]
    
    def Identifier(node: Extract[Node, `31`], state: Write): Unit
    @JSName("Identifier")
    var Identifier_Original: js.Function2[/* node */ Extract[Node, `31`], /* state */ Write, Unit]
    
    def IfStatement(node: Extract[Node, `28`], state: Write): Unit
    @JSName("IfStatement")
    var IfStatement_Original: js.Function2[/* node */ Extract[Node, `28`], /* state */ Write, Unit]
    
    def ImportDeclaration(node: Extract[Node, `66`], state: Write): Unit
    @JSName("ImportDeclaration")
    var ImportDeclaration_Original: js.Function2[/* node */ Extract[Node, `66`], /* state */ Write, Unit]
    
    def ImportDefaultSpecifier(node: Extract[Node, `4`], state: Write): Unit
    @JSName("ImportDefaultSpecifier")
    var ImportDefaultSpecifier_Original: js.Function2[/* node */ Extract[Node, `4`], /* state */ Write, Unit]
    
    def ImportExpression(node: Extract[Node, `64`], state: Write): Unit
    @JSName("ImportExpression")
    var ImportExpression_Original: js.Function2[/* node */ Extract[Node, `64`], /* state */ Write, Unit]
    
    def ImportNamespaceSpecifier(node: Extract[Node, `61`], state: Write): Unit
    @JSName("ImportNamespaceSpecifier")
    var ImportNamespaceSpecifier_Original: js.Function2[/* node */ Extract[Node, `61`], /* state */ Write, Unit]
    
    def ImportSpecifier(node: Extract[Node, `36`], state: Write): Unit
    @JSName("ImportSpecifier")
    var ImportSpecifier_Original: js.Function2[/* node */ Extract[Node, `36`], /* state */ Write, Unit]
    
    def LabeledStatement(node: Extract[Node, `9`], state: Write): Unit
    @JSName("LabeledStatement")
    var LabeledStatement_Original: js.Function2[/* node */ Extract[Node, `9`], /* state */ Write, Unit]
    
    def Literal(node: Extract[Node, `48`], state: Write): Unit
    @JSName("Literal")
    var Literal_Original: js.Function2[/* node */ Extract[Node, `48`], /* state */ Write, Unit]
    
    def LogicalExpression(node: Extract[Node, `23`], state: Write): Unit
    @JSName("LogicalExpression")
    var LogicalExpression_Original: js.Function2[/* node */ Extract[Node, `23`], /* state */ Write, Unit]
    
    def MemberExpression(node: Extract[Node, `19`], state: Write): Unit
    @JSName("MemberExpression")
    var MemberExpression_Original: js.Function2[/* node */ Extract[Node, `19`], /* state */ Write, Unit]
    
    def MetaProperty(node: Extract[Node, `27`], state: Write): Unit
    @JSName("MetaProperty")
    var MetaProperty_Original: js.Function2[/* node */ Extract[Node, `27`], /* state */ Write, Unit]
    
    def MethodDefinition(node: Extract[Node, `47`], state: Write): Unit
    @JSName("MethodDefinition")
    var MethodDefinition_Original: js.Function2[/* node */ Extract[Node, `47`], /* state */ Write, Unit]
    
    def NewExpression(node: Extract[Node, `18`], state: Write): Unit
    @JSName("NewExpression")
    var NewExpression_Original: js.Function2[/* node */ Extract[Node, `18`], /* state */ Write, Unit]
    
    def ObjectExpression(node: Extract[Node, `39`], state: Write): Unit
    @JSName("ObjectExpression")
    var ObjectExpression_Original: js.Function2[/* node */ Extract[Node, `39`], /* state */ Write, Unit]
    
    def ObjectPattern(node: Extract[Node, `62`], state: Write): Unit
    @JSName("ObjectPattern")
    var ObjectPattern_Original: js.Function2[/* node */ Extract[Node, `62`], /* state */ Write, Unit]
    
    def Program(node: Extract[Node, `49`], state: Write): Unit
    @JSName("Program")
    var Program_Original: js.Function2[/* node */ Extract[Node, `49`], /* state */ Write, Unit]
    
    def Property(node: Extract[Node, `45`], state: Write): Unit
    @JSName("Property")
    var Property_Original: js.Function2[/* node */ Extract[Node, `45`], /* state */ Write, Unit]
    
    def RestElement(node: Extract[Node, `8`], state: Write): Unit
    @JSName("RestElement")
    var RestElement_Original: js.Function2[/* node */ Extract[Node, `8`], /* state */ Write, Unit]
    
    def ReturnStatement(node: Extract[Node, `1`], state: Write): Unit
    @JSName("ReturnStatement")
    var ReturnStatement_Original: js.Function2[/* node */ Extract[Node, `1`], /* state */ Write, Unit]
    
    def SequenceExpression(node: Extract[Node, `53`], state: Write): Unit
    @JSName("SequenceExpression")
    var SequenceExpression_Original: js.Function2[/* node */ Extract[Node, `53`], /* state */ Write, Unit]
    
    def SpreadElement(node: Extract[Node, `5`], state: Write): Unit
    @JSName("SpreadElement")
    var SpreadElement_Original: js.Function2[/* node */ Extract[Node, `5`], /* state */ Write, Unit]
    
    def Super(node: Extract[Node, `50`], state: Write): Unit
    @JSName("Super")
    var Super_Original: js.Function2[/* node */ Extract[Node, `50`], /* state */ Write, Unit]
    
    def SwitchCase(node: Extract[Node, `16`], state: Write): Unit
    @JSName("SwitchCase")
    var SwitchCase_Original: js.Function2[/* node */ Extract[Node, `16`], /* state */ Write, Unit]
    
    def SwitchStatement(node: Extract[Node, `13`], state: Write): Unit
    @JSName("SwitchStatement")
    var SwitchStatement_Original: js.Function2[/* node */ Extract[Node, `13`], /* state */ Write, Unit]
    
    def TaggedTemplateExpression(node: Extract[Node, `24`], state: Write): Unit
    @JSName("TaggedTemplateExpression")
    var TaggedTemplateExpression_Original: js.Function2[/* node */ Extract[Node, `24`], /* state */ Write, Unit]
    
    def TemplateElement(node: Extract[Node, `58`], state: Write): Unit
    @JSName("TemplateElement")
    var TemplateElement_Original: js.Function2[/* node */ Extract[Node, `58`], /* state */ Write, Unit]
    
    def TemplateLiteral(node: Extract[Node, `25`], state: Write): Unit
    @JSName("TemplateLiteral")
    var TemplateLiteral_Original: js.Function2[/* node */ Extract[Node, `25`], /* state */ Write, Unit]
    
    def ThisExpression(node: Extract[Node, `65`], state: Write): Unit
    @JSName("ThisExpression")
    var ThisExpression_Original: js.Function2[/* node */ Extract[Node, `65`], /* state */ Write, Unit]
    
    def ThrowStatement(node: Extract[Node, `44`], state: Write): Unit
    @JSName("ThrowStatement")
    var ThrowStatement_Original: js.Function2[/* node */ Extract[Node, `44`], /* state */ Write, Unit]
    
    def TryStatement(node: Extract[Node, `6`], state: Write): Unit
    @JSName("TryStatement")
    var TryStatement_Original: js.Function2[/* node */ Extract[Node, `6`], /* state */ Write, Unit]
    
    def UnaryExpression(node: Extract[Node, `55`], state: Write): Unit
    @JSName("UnaryExpression")
    var UnaryExpression_Original: js.Function2[/* node */ Extract[Node, `55`], /* state */ Write, Unit]
    
    def UpdateExpression(node: Extract[Node, `32`], state: Write): Unit
    @JSName("UpdateExpression")
    var UpdateExpression_Original: js.Function2[/* node */ Extract[Node, `32`], /* state */ Write, Unit]
    
    def VariableDeclaration(node: Extract[Node, `22`], state: Write): Unit
    @JSName("VariableDeclaration")
    var VariableDeclaration_Original: js.Function2[/* node */ Extract[Node, `22`], /* state */ Write, Unit]
    
    def VariableDeclarator(node: Extract[Node, `40`], state: Write): Unit
    @JSName("VariableDeclarator")
    var VariableDeclarator_Original: js.Function2[/* node */ Extract[Node, `40`], /* state */ Write, Unit]
    
    def WhileStatement(node: Extract[Node, `11`], state: Write): Unit
    @JSName("WhileStatement")
    var WhileStatement_Original: js.Function2[/* node */ Extract[Node, `11`], /* state */ Write, Unit]
    
    def WithStatement(node: Extract[Node, `30`], state: Write): Unit
    @JSName("WithStatement")
    var WithStatement_Original: js.Function2[/* node */ Extract[Node, `30`], /* state */ Write, Unit]
    
    def YieldExpression(node: Extract[Node, `2`], state: Write): Unit
    @JSName("YieldExpression")
    var YieldExpression_Original: js.Function2[/* node */ Extract[Node, `2`], /* state */ Write, Unit]
  }
  object Generator {
    
    @scala.inline
    implicit class GeneratorMutableBuilder[Self <: Generator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayExpression(value: (/* node */ Extract[Node, `17`], /* state */ Write) => Unit): Self = StObject.set(x, "ArrayExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setArrayPattern(value: (/* node */ Extract[Node, `37`], /* state */ Write) => Unit): Self = StObject.set(x, "ArrayPattern", js.Any.fromFunction2(value))
      
      @scala.inline
      def setArrowFunctionExpression(value: (/* node */ Extract[Node, `46`], /* state */ Write) => Unit): Self = StObject.set(x, "ArrowFunctionExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAssignmentExpression(value: (/* node */ Extract[Node, `41`], /* state */ Write) => Unit): Self = StObject.set(x, "AssignmentExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAssignmentPattern(value: (/* node */ Extract[Node, `21`], /* state */ Write) => Unit): Self = StObject.set(x, "AssignmentPattern", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAwaitExpression(value: (/* node */ Extract[Node, `35`], /* state */ Write) => Unit): Self = StObject.set(x, "AwaitExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBinaryExpression(value: (/* node */ Extract[Node, `29`], /* state */ Write) => Unit): Self = StObject.set(x, "BinaryExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBlockStatement(value: (/* node */ Extract[Node, `7`], /* state */ Write) => Unit): Self = StObject.set(x, "BlockStatement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBreakStatement(value: (/* node */ Extract[Node, `0`], /* state */ Write) => Unit): Self = StObject.set(x, "BreakStatement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCallExpression(value: (/* node */ Extract[Node, `15`], /* state */ Write) => Unit): Self = StObject.set(x, "CallExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCatchClause(value: (/* node */ Extract[Node, `54`], /* state */ Write) => Unit): Self = StObject.set(x, "CatchClause", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChainExpression(value: (/* node */ Extract[Node, `60`], /* state */ Write) => Unit): Self = StObject.set(x, "ChainExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClassBody(value: (/* node */ Extract[Node, `63`], /* state */ Write) => Unit): Self = StObject.set(x, "ClassBody", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClassDeclaration(value: (/* node */ Extract[Node, `34`], /* state */ Write) => Unit): Self = StObject.set(x, "ClassDeclaration", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClassExpression(value: (/* node */ Extract[Node, Type], /* state */ Write) => Unit): Self = StObject.set(x, "ClassExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setConditionalExpression(value: (/* node */ Extract[Node, `52`], /* state */ Write) => Unit): Self = StObject.set(x, "ConditionalExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setContinueStatement(value: (/* node */ Extract[Node, `12`], /* state */ Write) => Unit): Self = StObject.set(x, "ContinueStatement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDebuggerStatement(value: (/* node */ Extract[Node, `43`], /* state */ Write) => Unit): Self = StObject.set(x, "DebuggerStatement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDoWhileStatement(value: (/* node */ Extract[Node, `59`], /* state */ Write) => Unit): Self = StObject.set(x, "DoWhileStatement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmptyStatement(value: (/* node */ Extract[Node, `33`], /* state */ Write) => Unit): Self = StObject.set(x, "EmptyStatement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExportAllDeclaration(value: (/* node */ Extract[Node, `10`], /* state */ Write) => Unit): Self = StObject.set(x, "ExportAllDeclaration", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExportDefaultDeclaration(value: (/* node */ Extract[Node, `26`], /* state */ Write) => Unit): Self = StObject.set(x, "ExportDefaultDeclaration", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExportNamedDeclaration(value: (/* node */ Extract[Node, `14`], /* state */ Write) => Unit): Self = StObject.set(x, "ExportNamedDeclaration", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExportSpecifier(value: (/* node */ Extract[Node, `38`], /* state */ Write) => Unit): Self = StObject.set(x, "ExportSpecifier", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExpressionStatement(value: (/* node */ Extract[Node, `20`], /* state */ Write) => Unit): Self = StObject.set(x, "ExpressionStatement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setForInStatement(value: (/* node */ Extract[Node, `3`], /* state */ Write) => Unit): Self = StObject.set(x, "ForInStatement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setForOfStatement(value: (/* node */ Extract[Node, `51`], /* state */ Write) => Unit): Self = StObject.set(x, "ForOfStatement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setForStatement(value: (/* node */ Extract[Node, `56`], /* state */ Write) => Unit): Self = StObject.set(x, "ForStatement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFunctionDeclaration(value: (/* node */ Extract[Node, `42`], /* state */ Write) => Unit): Self = StObject.set(x, "FunctionDeclaration", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFunctionExpression(value: (/* node */ Extract[Node, `57`], /* state */ Write) => Unit): Self = StObject.set(x, "FunctionExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIdentifier(value: (/* node */ Extract[Node, `31`], /* state */ Write) => Unit): Self = StObject.set(x, "Identifier", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIfStatement(value: (/* node */ Extract[Node, `28`], /* state */ Write) => Unit): Self = StObject.set(x, "IfStatement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setImportDeclaration(value: (/* node */ Extract[Node, `66`], /* state */ Write) => Unit): Self = StObject.set(x, "ImportDeclaration", js.Any.fromFunction2(value))
      
      @scala.inline
      def setImportDefaultSpecifier(value: (/* node */ Extract[Node, `4`], /* state */ Write) => Unit): Self = StObject.set(x, "ImportDefaultSpecifier", js.Any.fromFunction2(value))
      
      @scala.inline
      def setImportExpression(value: (/* node */ Extract[Node, `64`], /* state */ Write) => Unit): Self = StObject.set(x, "ImportExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setImportNamespaceSpecifier(value: (/* node */ Extract[Node, `61`], /* state */ Write) => Unit): Self = StObject.set(x, "ImportNamespaceSpecifier", js.Any.fromFunction2(value))
      
      @scala.inline
      def setImportSpecifier(value: (/* node */ Extract[Node, `36`], /* state */ Write) => Unit): Self = StObject.set(x, "ImportSpecifier", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLabeledStatement(value: (/* node */ Extract[Node, `9`], /* state */ Write) => Unit): Self = StObject.set(x, "LabeledStatement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLiteral(value: (/* node */ Extract[Node, `48`], /* state */ Write) => Unit): Self = StObject.set(x, "Literal", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLogicalExpression(value: (/* node */ Extract[Node, `23`], /* state */ Write) => Unit): Self = StObject.set(x, "LogicalExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMemberExpression(value: (/* node */ Extract[Node, `19`], /* state */ Write) => Unit): Self = StObject.set(x, "MemberExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMetaProperty(value: (/* node */ Extract[Node, `27`], /* state */ Write) => Unit): Self = StObject.set(x, "MetaProperty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMethodDefinition(value: (/* node */ Extract[Node, `47`], /* state */ Write) => Unit): Self = StObject.set(x, "MethodDefinition", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNewExpression(value: (/* node */ Extract[Node, `18`], /* state */ Write) => Unit): Self = StObject.set(x, "NewExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setObjectExpression(value: (/* node */ Extract[Node, `39`], /* state */ Write) => Unit): Self = StObject.set(x, "ObjectExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setObjectPattern(value: (/* node */ Extract[Node, `62`], /* state */ Write) => Unit): Self = StObject.set(x, "ObjectPattern", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProgram(value: (/* node */ Extract[Node, `49`], /* state */ Write) => Unit): Self = StObject.set(x, "Program", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProperty(value: (/* node */ Extract[Node, `45`], /* state */ Write) => Unit): Self = StObject.set(x, "Property", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRestElement(value: (/* node */ Extract[Node, `8`], /* state */ Write) => Unit): Self = StObject.set(x, "RestElement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReturnStatement(value: (/* node */ Extract[Node, `1`], /* state */ Write) => Unit): Self = StObject.set(x, "ReturnStatement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSequenceExpression(value: (/* node */ Extract[Node, `53`], /* state */ Write) => Unit): Self = StObject.set(x, "SequenceExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSpreadElement(value: (/* node */ Extract[Node, `5`], /* state */ Write) => Unit): Self = StObject.set(x, "SpreadElement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSuper(value: (/* node */ Extract[Node, `50`], /* state */ Write) => Unit): Self = StObject.set(x, "Super", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSwitchCase(value: (/* node */ Extract[Node, `16`], /* state */ Write) => Unit): Self = StObject.set(x, "SwitchCase", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSwitchStatement(value: (/* node */ Extract[Node, `13`], /* state */ Write) => Unit): Self = StObject.set(x, "SwitchStatement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTaggedTemplateExpression(value: (/* node */ Extract[Node, `24`], /* state */ Write) => Unit): Self = StObject.set(x, "TaggedTemplateExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTemplateElement(value: (/* node */ Extract[Node, `58`], /* state */ Write) => Unit): Self = StObject.set(x, "TemplateElement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTemplateLiteral(value: (/* node */ Extract[Node, `25`], /* state */ Write) => Unit): Self = StObject.set(x, "TemplateLiteral", js.Any.fromFunction2(value))
      
      @scala.inline
      def setThisExpression(value: (/* node */ Extract[Node, `65`], /* state */ Write) => Unit): Self = StObject.set(x, "ThisExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setThrowStatement(value: (/* node */ Extract[Node, `44`], /* state */ Write) => Unit): Self = StObject.set(x, "ThrowStatement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTryStatement(value: (/* node */ Extract[Node, `6`], /* state */ Write) => Unit): Self = StObject.set(x, "TryStatement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnaryExpression(value: (/* node */ Extract[Node, `55`], /* state */ Write) => Unit): Self = StObject.set(x, "UnaryExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateExpression(value: (/* node */ Extract[Node, `32`], /* state */ Write) => Unit): Self = StObject.set(x, "UpdateExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVariableDeclaration(value: (/* node */ Extract[Node, `22`], /* state */ Write) => Unit): Self = StObject.set(x, "VariableDeclaration", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVariableDeclarator(value: (/* node */ Extract[Node, `40`], /* state */ Write) => Unit): Self = StObject.set(x, "VariableDeclarator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWhileStatement(value: (/* node */ Extract[Node, `11`], /* state */ Write) => Unit): Self = StObject.set(x, "WhileStatement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWithStatement(value: (/* node */ Extract[Node, `30`], /* state */ Write) => Unit): Self = StObject.set(x, "WithStatement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setYieldExpression(value: (/* node */ Extract[Node, `2`], /* state */ Write) => Unit): Self = StObject.set(x, "YieldExpression", js.Any.fromFunction2(value))
    }
  }
  
  trait Options extends StObject {
    
    /** generate comments if true (defaults to false) */
    var comments: js.UndefOr[Boolean] = js.undefined
    
    /** custom code generator (defaults to astring.baseGenerator) */
    var generator: js.UndefOr[js.Object] = js.undefined
    
    /** string to use for indentation (defaults to "  ") */
    var indent: js.UndefOr[String] = js.undefined
    
    /** string to use for line endings (defaults to "\n") */
    var lineEnd: js.UndefOr[String] = js.undefined
    
    /** source map generator (defaults to null), see https://github.com/mozilla/source-map#sourcemapgenerator */
    var sourceMap: js.UndefOr[js.Any] = js.undefined
    
    /** indent level to start from (defaults to 0) */
    var startingIndentLevel: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setGenerator(value: js.Object): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setLineEnd(value: String): Self = StObject.set(x, "lineEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineEndUndefined: Self = StObject.set(x, "lineEnd", js.undefined)
      
      @scala.inline
      def setSourceMap(value: js.Any): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      @scala.inline
      def setStartingIndentLevel(value: Double): Self = StObject.set(x, "startingIndentLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartingIndentLevelUndefined: Self = StObject.set(x, "startingIndentLevel", js.undefined)
    }
  }
}
