package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3HudiSource extends StObject {
  
  /**
    * Specifies additional connection options.
    */
  var AdditionalHudiOptions: js.UndefOr[AdditionalOptions] = js.undefined
  
  /**
    * Specifies additional options for the connector.
    */
  var AdditionalOptions: js.UndefOr[S3DirectSourceAdditionalOptions] = js.undefined
  
  /**
    * The name of the Hudi source.
    */
  var Name: NodeName
  
  /**
    * Specifies the data schema for the Hudi source.
    */
  var OutputSchemas: js.UndefOr[GlueSchemas] = js.undefined
  
  /**
    * A list of the Amazon S3 paths to read from.
    */
  var Paths: EnclosedInStringProperties
}
object S3HudiSource {
  
  inline def apply(Name: NodeName, Paths: EnclosedInStringProperties): S3HudiSource = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Paths = Paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3HudiSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3HudiSource] (val x: Self) extends AnyVal {
    
    inline def setAdditionalHudiOptions(value: AdditionalOptions): Self = StObject.set(x, "AdditionalHudiOptions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalHudiOptionsUndefined: Self = StObject.set(x, "AdditionalHudiOptions", js.undefined)
    
    inline def setAdditionalOptions(value: S3DirectSourceAdditionalOptions): Self = StObject.set(x, "AdditionalOptions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalOptionsUndefined: Self = StObject.set(x, "AdditionalOptions", js.undefined)
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemas(value: GlueSchemas): Self = StObject.set(x, "OutputSchemas", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemasUndefined: Self = StObject.set(x, "OutputSchemas", js.undefined)
    
    inline def setOutputSchemasVarargs(value: GlueSchema*): Self = StObject.set(x, "OutputSchemas", js.Array(value*))
    
    inline def setPaths(value: EnclosedInStringProperties): Self = StObject.set(x, "Paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: EnclosedInStringProperty*): Self = StObject.set(x, "Paths", js.Array(value*))
  }
}
