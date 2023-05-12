package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWhatIfForecastExportRequest extends StObject {
  
  /**
    * The location where you want to save the forecast and an Identity and Access Management (IAM) role that Amazon Forecast can assume to access the location. The forecast must be exported to an Amazon S3 bucket. If encryption is used, Destination must include an Key Management Service (KMS) key. The IAM role must allow Amazon Forecast permission to access the key.
    */
  var Destination: DataDestination
  
  /**
    * The format of the exported data, CSV or PARQUET.
    */
  var Format: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Format] = js.undefined
  
  /**
    * A list of tags to apply to the what if forecast.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Tags] = js.undefined
  
  /**
    * The list of what-if forecast Amazon Resource Names (ARNs) to export.
    */
  var WhatIfForecastArns: WhatIfForecastArnListForExport
  
  /**
    * The name of the what-if forecast to export.
    */
  var WhatIfForecastExportName: Name
}
object CreateWhatIfForecastExportRequest {
  
  inline def apply(
    Destination: DataDestination,
    WhatIfForecastArns: WhatIfForecastArnListForExport,
    WhatIfForecastExportName: Name
  ): CreateWhatIfForecastExportRequest = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], WhatIfForecastArns = WhatIfForecastArns.asInstanceOf[js.Any], WhatIfForecastExportName = WhatIfForecastExportName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWhatIfForecastExportRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWhatIfForecastExportRequest] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: DataDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Format): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setWhatIfForecastArns(value: WhatIfForecastArnListForExport): Self = StObject.set(x, "WhatIfForecastArns", value.asInstanceOf[js.Any])
    
    inline def setWhatIfForecastArnsVarargs(value: LongArn*): Self = StObject.set(x, "WhatIfForecastArns", js.Array(value*))
    
    inline def setWhatIfForecastExportName(value: Name): Self = StObject.set(x, "WhatIfForecastExportName", value.asInstanceOf[js.Any])
  }
}
