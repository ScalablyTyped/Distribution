package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode
import typings.typescript.mod.DiagnosticMessageChain
import typings.typescript.mod.DiagnosticRelatedInformation
import typings.typescript.mod.DiagnosticWithLocation
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscDiagnosticsSrcErrorMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/diagnostics/src/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/diagnostics/src/error", "FatalDiagnosticError")
  @js.native
  open class FatalDiagnosticError protected () extends StObject {
    def this(code: ErrorCode, node: Node, message: String) = this()
    def this(code: ErrorCode, node: Node, message: DiagnosticMessageChain) = this()
    def this(
      code: ErrorCode,
      node: Node,
      message: String,
      relatedInformation: js.Array[DiagnosticRelatedInformation]
    ) = this()
    def this(
      code: ErrorCode,
      node: Node,
      message: DiagnosticMessageChain,
      relatedInformation: js.Array[DiagnosticRelatedInformation]
    ) = this()
    
    val code: ErrorCode = js.native
    
    val message: String | DiagnosticMessageChain = js.native
    
    val node: Node = js.native
    
    val relatedInformation: js.UndefOr[js.Array[DiagnosticRelatedInformation]] = js.native
    
    def toDiagnostic(): DiagnosticWithLocation = js.native
  }
  
  inline def addDiagnosticChain(messageText: String, add: js.Array[DiagnosticMessageChain]): DiagnosticMessageChain = (^.asInstanceOf[js.Dynamic].applyDynamic("addDiagnosticChain")(messageText.asInstanceOf[js.Any], add.asInstanceOf[js.Any])).asInstanceOf[DiagnosticMessageChain]
  inline def addDiagnosticChain(messageText: DiagnosticMessageChain, add: js.Array[DiagnosticMessageChain]): DiagnosticMessageChain = (^.asInstanceOf[js.Dynamic].applyDynamic("addDiagnosticChain")(messageText.asInstanceOf[js.Any], add.asInstanceOf[js.Any])).asInstanceOf[DiagnosticMessageChain]
  
  inline def isFatalDiagnosticError(err: Any): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/diagnostics/src/error.FatalDiagnosticError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFatalDiagnosticError")(err.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/diagnostics/src/error.FatalDiagnosticError */ Boolean]
  
  inline def makeDiagnostic(code: ErrorCode, node: Node, messageText: String): DiagnosticWithLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDiagnostic")(code.asInstanceOf[js.Any], node.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any])).asInstanceOf[DiagnosticWithLocation]
  inline def makeDiagnostic(
    code: ErrorCode,
    node: Node,
    messageText: String,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): DiagnosticWithLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDiagnostic")(code.asInstanceOf[js.Any], node.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[DiagnosticWithLocation]
  inline def makeDiagnostic(code: ErrorCode, node: Node, messageText: DiagnosticMessageChain): DiagnosticWithLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDiagnostic")(code.asInstanceOf[js.Any], node.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any])).asInstanceOf[DiagnosticWithLocation]
  inline def makeDiagnostic(
    code: ErrorCode,
    node: Node,
    messageText: DiagnosticMessageChain,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): DiagnosticWithLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDiagnostic")(code.asInstanceOf[js.Any], node.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[DiagnosticWithLocation]
  
  inline def makeDiagnosticChain(messageText: String): DiagnosticMessageChain = ^.asInstanceOf[js.Dynamic].applyDynamic("makeDiagnosticChain")(messageText.asInstanceOf[js.Any]).asInstanceOf[DiagnosticMessageChain]
  inline def makeDiagnosticChain(messageText: String, next: js.Array[DiagnosticMessageChain]): DiagnosticMessageChain = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDiagnosticChain")(messageText.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[DiagnosticMessageChain]
  
  inline def makeRelatedInformation(node: Node, messageText: String): DiagnosticRelatedInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRelatedInformation")(node.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any])).asInstanceOf[DiagnosticRelatedInformation]
}
