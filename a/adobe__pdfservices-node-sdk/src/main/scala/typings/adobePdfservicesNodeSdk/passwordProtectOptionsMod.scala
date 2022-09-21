package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.AES_128
import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.AES_256
import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.ALL_CONTENT
import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.ALL_CONTENT_EXCEPT_METADATA
import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.COPY_CONTENT
import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.EDIT_ANNOTATIONS
import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.EDIT_CONTENT
import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.EDIT_DOCUMENT_ASSEMBLY
import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.EDIT_FILL_AND_SIGN_FORM_FIELDS
import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.PRINT_HIGH_QUALITY
import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.PRINT_LOW_QUALITY
import typings.adobePdfservicesNodeSdk.permissionsMod.Permissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object passwordProtectOptionsMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/option/protectpdf/password-protect-options", "PasswordProtectOptions")
  @js.native
  open class PasswordProtectOptions protected () extends StObject {
    def this(builder: PasswordProtectOptions) = this()
    
    var contentEncryption: ContentEncryption = js.native
    
    var encryptionAlgorithm: EncryptionAlgorithm = js.native
    
    var ownerPassword: String = js.native
    
    var permissions: Permission = js.native
    
    var userPassword: String = js.native
    
    def validate(): Boolean = js.native
  }
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/option/protectpdf/password-protect-options", "PasswordProtectOptionsBuilder")
  @js.native
  open class PasswordProtectOptionsBuilder () extends StObject {
    
    def build(): PasswordProtectOptions = js.native
    
    def setContentEncryption(contentEncryption: ALL_CONTENT | ALL_CONTENT_EXCEPT_METADATA): PasswordProtectOptionsBuilder = js.native
    
    def setEncryptionAlgorithm(encryptionAlgorithm: AES_128 | AES_256): PasswordProtectOptionsBuilder = js.native
    
    def setOwnerPassword(ownerPassword: String): PasswordProtectOptionsBuilder = js.native
    
    def setPermissions(permissions: Permissions): PasswordProtectOptionsBuilder = js.native
    
    def setUserPassword(userPassword: String): PasswordProtectOptionsBuilder = js.native
  }
  
  trait ContentEncryption extends StObject {
    
    /**
      * Encrypts all the content of the PDF file.
      */
    var ALL_CONTENT: typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.ALL_CONTENT
    
    /**
      * Encrypts all the content except the metadata of the PDF file.
      */
    var ALL_CONTENT_EXCEPT_METADATA: typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.ALL_CONTENT_EXCEPT_METADATA
  }
  object ContentEncryption {
    
    inline def apply(): ContentEncryption = {
      val __obj = js.Dynamic.literal(ALL_CONTENT = "ALL_CONTENT", ALL_CONTENT_EXCEPT_METADATA = "ALL_CONTENT_EXCEPT_METADATA")
      __obj.asInstanceOf[ContentEncryption]
    }
    
    extension [Self <: ContentEncryption](x: Self) {
      
      inline def setALL_CONTENT(value: ALL_CONTENT): Self = StObject.set(x, "ALL_CONTENT", value.asInstanceOf[js.Any])
      
      inline def setALL_CONTENT_EXCEPT_METADATA(value: ALL_CONTENT_EXCEPT_METADATA): Self = StObject.set(x, "ALL_CONTENT_EXCEPT_METADATA", value.asInstanceOf[js.Any])
    }
  }
  
  trait EncryptionAlgorithm extends StObject {
    
    /**
      * Represents AES-128 encryption algorithm.
      */
    var AES_128: typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.AES_128
    
    /**
      * Represents AES-256 encryption algorithm.
      */
    var AES_256: typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.AES_256
  }
  object EncryptionAlgorithm {
    
    inline def apply(): EncryptionAlgorithm = {
      val __obj = js.Dynamic.literal(AES_128 = "AES_128", AES_256 = "AES_256")
      __obj.asInstanceOf[EncryptionAlgorithm]
    }
    
    extension [Self <: EncryptionAlgorithm](x: Self) {
      
      inline def setAES_128(value: AES_128): Self = StObject.set(x, "AES_128", value.asInstanceOf[js.Any])
      
      inline def setAES_256(value: AES_256): Self = StObject.set(x, "AES_256", value.asInstanceOf[js.Any])
    }
  }
  
  trait Permission extends StObject {
    
    /**
      * Enables copying of content from the PDF document.
      */
    var COPY_CONTENT: typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.COPY_CONTENT
    
    /**
      * Enables additions of comments, digital signatures and filling in of forms in a PDF document.
      */
    var EDIT_ANNOTATIONS: typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.EDIT_ANNOTATIONS
    
    /**
      * Enables all the editing permissions in the PDF document except commenting and page extraction.
      */
    var EDIT_CONTENT: typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.EDIT_CONTENT
    
    /**
      * Enables insertion, deletion and rotation of pages in a PDF document.
      */
    var EDIT_DOCUMENT_ASSEMBLY: typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.EDIT_DOCUMENT_ASSEMBLY
    
    /**
      * Enables filling in of forms, digital signature and creation of template pages in a PDF document.
      */
    var EDIT_FILL_AND_SIGN_FORM_FIELDS: typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.EDIT_FILL_AND_SIGN_FORM_FIELDS
    
    /**
      * Enables high quality printing of the PDF document.
      */
    var PRINT_HIGH_QUALITY: typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.PRINT_HIGH_QUALITY
    
    /**
      * Enables low quality printing of the PDF document.
      */
    var PRINT_LOW_QUALITY: typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.PRINT_LOW_QUALITY
  }
  object Permission {
    
    inline def apply(): Permission = {
      val __obj = js.Dynamic.literal(COPY_CONTENT = "COPY_CONTENT", EDIT_ANNOTATIONS = "EDIT_ANNOTATIONS", EDIT_CONTENT = "EDIT_CONTENT", EDIT_DOCUMENT_ASSEMBLY = "EDIT_DOCUMENT_ASSEMBLY", EDIT_FILL_AND_SIGN_FORM_FIELDS = "EDIT_FILL_AND_SIGN_FORM_FIELDS", PRINT_HIGH_QUALITY = "PRINT_HIGH_QUALITY", PRINT_LOW_QUALITY = "PRINT_LOW_QUALITY")
      __obj.asInstanceOf[Permission]
    }
    
    extension [Self <: Permission](x: Self) {
      
      inline def setCOPY_CONTENT(value: COPY_CONTENT): Self = StObject.set(x, "COPY_CONTENT", value.asInstanceOf[js.Any])
      
      inline def setEDIT_ANNOTATIONS(value: EDIT_ANNOTATIONS): Self = StObject.set(x, "EDIT_ANNOTATIONS", value.asInstanceOf[js.Any])
      
      inline def setEDIT_CONTENT(value: EDIT_CONTENT): Self = StObject.set(x, "EDIT_CONTENT", value.asInstanceOf[js.Any])
      
      inline def setEDIT_DOCUMENT_ASSEMBLY(value: EDIT_DOCUMENT_ASSEMBLY): Self = StObject.set(x, "EDIT_DOCUMENT_ASSEMBLY", value.asInstanceOf[js.Any])
      
      inline def setEDIT_FILL_AND_SIGN_FORM_FIELDS(value: EDIT_FILL_AND_SIGN_FORM_FIELDS): Self = StObject.set(x, "EDIT_FILL_AND_SIGN_FORM_FIELDS", value.asInstanceOf[js.Any])
      
      inline def setPRINT_HIGH_QUALITY(value: PRINT_HIGH_QUALITY): Self = StObject.set(x, "PRINT_HIGH_QUALITY", value.asInstanceOf[js.Any])
      
      inline def setPRINT_LOW_QUALITY(value: PRINT_LOW_QUALITY): Self = StObject.set(x, "PRINT_LOW_QUALITY", value.asInstanceOf[js.Any])
    }
  }
}
