package typings.activexIwshruntimelibrary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScriptSigner {
  
  @js.native
  trait Signer extends StObject {
    
    @JSName("ScriptSigner.Signer_typekey")
    var ScriptSignerDotSigner_typekey: Signer = js.native
    
    /** @param Store [Store='my'] */
    def Sign(FileExtension: String, Text: String, Certificate: String): String = js.native
    def Sign(FileExtension: String, Text: String, Certificate: String, Store: String): String = js.native
    
    /** @param Store [Store='my'] */
    def SignFile(FileName: String, Certificate: String): Unit = js.native
    def SignFile(FileName: String, Certificate: String, Store: String): Unit = js.native
    
    /** @param ShowUI [ShowUI=false] */
    def Verify(FileExtension: String, Text: String): Boolean = js.native
    def Verify(FileExtension: String, Text: String, ShowUI: Boolean): Boolean = js.native
    
    /** @param ShowUI [ShowUI=false] */
    def VerifyFile(FileName: String): Boolean = js.native
    def VerifyFile(FileName: String, ShowUI: Boolean): Boolean = js.native
  }
}
