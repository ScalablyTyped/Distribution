package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateVersionSourceInput extends StObject {
  
  /**
    * An S3 source object that includes the template bundle S3 path and name for a template minor version.
    */
  var s3: js.UndefOr[S3ObjectSource] = js.undefined
}
object TemplateVersionSourceInput {
  
  inline def apply(): TemplateVersionSourceInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateVersionSourceInput]
  }
  
  extension [Self <: TemplateVersionSourceInput](x: Self) {
    
    inline def setS3(value: S3ObjectSource): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
  }
}
