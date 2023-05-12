package typings.angularCompilerCli.srcNgtscMetadataSrcApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataRegistry extends StObject {
  
  def registerDirectiveMetadata(meta: DirectiveMeta): Unit
  
  def registerNgModuleMetadata(meta: NgModuleMeta): Unit
  
  def registerPipeMetadata(meta: PipeMeta): Unit
}
object MetadataRegistry {
  
  inline def apply(
    registerDirectiveMetadata: DirectiveMeta => Unit,
    registerNgModuleMetadata: NgModuleMeta => Unit,
    registerPipeMetadata: PipeMeta => Unit
  ): MetadataRegistry = {
    val __obj = js.Dynamic.literal(registerDirectiveMetadata = js.Any.fromFunction1(registerDirectiveMetadata), registerNgModuleMetadata = js.Any.fromFunction1(registerNgModuleMetadata), registerPipeMetadata = js.Any.fromFunction1(registerPipeMetadata))
    __obj.asInstanceOf[MetadataRegistry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetadataRegistry] (val x: Self) extends AnyVal {
    
    inline def setRegisterDirectiveMetadata(value: DirectiveMeta => Unit): Self = StObject.set(x, "registerDirectiveMetadata", js.Any.fromFunction1(value))
    
    inline def setRegisterNgModuleMetadata(value: NgModuleMeta => Unit): Self = StObject.set(x, "registerNgModuleMetadata", js.Any.fromFunction1(value))
    
    inline def setRegisterPipeMetadata(value: PipeMeta => Unit): Self = StObject.set(x, "registerPipeMetadata", js.Any.fromFunction1(value))
  }
}
