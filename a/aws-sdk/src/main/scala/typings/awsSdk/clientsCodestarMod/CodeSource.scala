package typings.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeSource extends StObject {
  
  /**
    * Information about the Amazon S3 location where the source code files provided with the project request are stored. 
    */
  var s3: S3Location
}
object CodeSource {
  
  inline def apply(s3: S3Location): CodeSource = {
    val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeSource] (val x: Self) extends AnyVal {
    
    inline def setS3(value: S3Location): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
  }
}
