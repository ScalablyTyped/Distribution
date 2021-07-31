package typings.apolloProtobufjs.descriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileOptions extends StObject {
  
  var ccEnableArenas: js.UndefOr[Boolean] = js.undefined
  
  var ccGenericServices: js.UndefOr[Boolean] = js.undefined
  
  var csharpNamespace: js.UndefOr[String] = js.undefined
  
  var deprecated: js.UndefOr[Boolean] = js.undefined
  
  var goPackage: js.UndefOr[String] = js.undefined
  
  var javaGenerateEqualsAndHash: js.UndefOr[Boolean] = js.undefined
  
  var javaGenericServices: js.UndefOr[Boolean] = js.undefined
  
  var javaMultipleFiles: js.UndefOr[Boolean] = js.undefined
  
  var javaOuterClassname: js.UndefOr[String] = js.undefined
  
  var javaPackage: js.UndefOr[String] = js.undefined
  
  var javaStringCheckUtf8: js.UndefOr[Boolean] = js.undefined
  
  var objcClassPrefix: js.UndefOr[String] = js.undefined
  
  var optimizeFor: js.UndefOr[IFileOptionsOptimizeMode] = js.undefined
  
  var pyGenericServices: js.UndefOr[Boolean] = js.undefined
}
object IFileOptions {
  
  @scala.inline
  def apply(): IFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileOptions]
  }
  
  @scala.inline
  implicit class IFileOptionsMutableBuilder[Self <: IFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCcEnableArenas(value: Boolean): Self = StObject.set(x, "ccEnableArenas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcEnableArenasUndefined: Self = StObject.set(x, "ccEnableArenas", js.undefined)
    
    @scala.inline
    def setCcGenericServices(value: Boolean): Self = StObject.set(x, "ccGenericServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcGenericServicesUndefined: Self = StObject.set(x, "ccGenericServices", js.undefined)
    
    @scala.inline
    def setCsharpNamespace(value: String): Self = StObject.set(x, "csharpNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsharpNamespaceUndefined: Self = StObject.set(x, "csharpNamespace", js.undefined)
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setGoPackage(value: String): Self = StObject.set(x, "goPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoPackageUndefined: Self = StObject.set(x, "goPackage", js.undefined)
    
    @scala.inline
    def setJavaGenerateEqualsAndHash(value: Boolean): Self = StObject.set(x, "javaGenerateEqualsAndHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaGenerateEqualsAndHashUndefined: Self = StObject.set(x, "javaGenerateEqualsAndHash", js.undefined)
    
    @scala.inline
    def setJavaGenericServices(value: Boolean): Self = StObject.set(x, "javaGenericServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaGenericServicesUndefined: Self = StObject.set(x, "javaGenericServices", js.undefined)
    
    @scala.inline
    def setJavaMultipleFiles(value: Boolean): Self = StObject.set(x, "javaMultipleFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaMultipleFilesUndefined: Self = StObject.set(x, "javaMultipleFiles", js.undefined)
    
    @scala.inline
    def setJavaOuterClassname(value: String): Self = StObject.set(x, "javaOuterClassname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaOuterClassnameUndefined: Self = StObject.set(x, "javaOuterClassname", js.undefined)
    
    @scala.inline
    def setJavaPackage(value: String): Self = StObject.set(x, "javaPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaPackageUndefined: Self = StObject.set(x, "javaPackage", js.undefined)
    
    @scala.inline
    def setJavaStringCheckUtf8(value: Boolean): Self = StObject.set(x, "javaStringCheckUtf8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaStringCheckUtf8Undefined: Self = StObject.set(x, "javaStringCheckUtf8", js.undefined)
    
    @scala.inline
    def setObjcClassPrefix(value: String): Self = StObject.set(x, "objcClassPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjcClassPrefixUndefined: Self = StObject.set(x, "objcClassPrefix", js.undefined)
    
    @scala.inline
    def setOptimizeFor(value: IFileOptionsOptimizeMode): Self = StObject.set(x, "optimizeFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeForUndefined: Self = StObject.set(x, "optimizeFor", js.undefined)
    
    @scala.inline
    def setPyGenericServices(value: Boolean): Self = StObject.set(x, "pyGenericServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPyGenericServicesUndefined: Self = StObject.set(x, "pyGenericServices", js.undefined)
  }
}
