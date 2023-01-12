package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStorageConfigurationResponse extends StObject {
  
  var configurationStatus: ConfigurationStatus
  
  /**
    * Contains the storage configuration for time series (data streams) that aren't associated with asset properties. The disassociatedDataStorage can be one of the following values:    ENABLED – IoT SiteWise accepts time series that aren't associated with asset properties.  After the disassociatedDataStorage is enabled, you can't disable it.     DISABLED – IoT SiteWise doesn't accept time series (data streams) that aren't associated with asset properties.   For more information, see Data streams in the IoT SiteWise User Guide.
    */
  var disassociatedDataStorage: js.UndefOr[DisassociatedDataStorageState] = js.undefined
  
  /**
    * The date the storage configuration was last updated, in Unix epoch time.
    */
  var lastUpdateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Contains information about the storage destination.
    */
  var multiLayerStorage: js.UndefOr[MultiLayerStorage] = js.undefined
  
  /**
    * How many days your data is kept in the hot tier. By default, your data is kept indefinitely in the hot tier.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
  
  /**
    * The storage tier that you specified for your data. The storageType parameter can be one of the following values:    SITEWISE_DEFAULT_STORAGE – IoT SiteWise saves your data into the hot tier. The hot tier is a service-managed database.    MULTI_LAYER_STORAGE – IoT SiteWise saves your data in both the cold tier and the hot tier. The cold tier is a customer-managed Amazon S3 bucket.  
    */
  var storageType: StorageType
}
object DescribeStorageConfigurationResponse {
  
  inline def apply(configurationStatus: ConfigurationStatus, storageType: StorageType): DescribeStorageConfigurationResponse = {
    val __obj = js.Dynamic.literal(configurationStatus = configurationStatus.asInstanceOf[js.Any], storageType = storageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStorageConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeStorageConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setConfigurationStatus(value: ConfigurationStatus): Self = StObject.set(x, "configurationStatus", value.asInstanceOf[js.Any])
    
    inline def setDisassociatedDataStorage(value: DisassociatedDataStorageState): Self = StObject.set(x, "disassociatedDataStorage", value.asInstanceOf[js.Any])
    
    inline def setDisassociatedDataStorageUndefined: Self = StObject.set(x, "disassociatedDataStorage", js.undefined)
    
    inline def setLastUpdateDate(value: js.Date): Self = StObject.set(x, "lastUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDateUndefined: Self = StObject.set(x, "lastUpdateDate", js.undefined)
    
    inline def setMultiLayerStorage(value: MultiLayerStorage): Self = StObject.set(x, "multiLayerStorage", value.asInstanceOf[js.Any])
    
    inline def setMultiLayerStorageUndefined: Self = StObject.set(x, "multiLayerStorage", js.undefined)
    
    inline def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
    
    inline def setStorageType(value: StorageType): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
  }
}
