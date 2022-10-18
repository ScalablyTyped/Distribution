package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBInstanceMessage extends StObject {
  
  /**
    * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as soon as possible, regardless of the PreferredMaintenanceWindow setting for the instance.   If this parameter is set to false, changes to the instance are applied during the next maintenance window. Some parameter changes can cause an outage and are applied on the next reboot. Default: false 
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This parameter does not apply to Amazon DocumentDB. Amazon DocumentDB does not perform minor version upgrades regardless of the value set.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Indicates the certificate that needs to be associated with the instance.
    */
  var CACertificateIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether to copy all tags from the DB instance to snapshots of the DB instance. By default, tags are not copied.
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The new compute and memory capacity of the instance; for example, db.r5.large. Not all instance classes are available in all Amazon Web Services Regions.  If you modify the instance class, an outage occurs during the change. The change is applied during the next maintenance window, unless ApplyImmediately is specified as true for this request.  Default: Uses existing setting.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  
  /**
    * The instance identifier. This value is stored as a lowercase string. Constraints:   Must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: String
  
  /**
    * A value that indicates whether to enable Performance Insights for the DB Instance. For more information, see Using Amazon Performance Insights.
    */
  var EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    *  The new instance identifier for the instance when renaming an instance. When you change the instance identifier, an instance reboot occurs immediately if you set Apply Immediately to true. It occurs during the next maintenance window if you set Apply Immediately to false. This value is stored as a lowercase string.  Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: mydbinstance 
    */
  var NewDBInstanceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The KMS key identifier for encryption of Performance Insights data. The KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. If you do not specify a value for PerformanceInsightsKMSKeyId, then Amazon DocumentDB uses your default KMS key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a different default KMS key for each Amazon Web Services region.
    */
  var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage. Changing this parameter doesn't result in an outage except in the following situation, and the change is asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance window is changed to include the current time, changing this parameter causes a reboot of the instance. If you are moving this window to the current time, there must be at least 30 minutes between the current time and end of the window to ensure that pending changes are applied. Default: Uses existing setting. Format: ddd:hh24:mi-ddd:hh24:mi  Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun Constraints: Must be at least 30 minutes.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after a failure of the existing primary instance. Default: 1 Valid values: 0-15
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
}
object ModifyDBInstanceMessage {
  
  inline def apply(DBInstanceIdentifier: String): ModifyDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBInstanceMessage]
  }
  
  extension [Self <: ModifyDBInstanceMessage](x: Self) {
    
    inline def setApplyImmediately(value: Boolean): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    inline def setApplyImmediatelyUndefined: Self = StObject.set(x, "ApplyImmediately", js.undefined)
    
    inline def setAutoMinorVersionUpgrade(value: BooleanOptional): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    inline def setCACertificateIdentifier(value: String): Self = StObject.set(x, "CACertificateIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCACertificateIdentifierUndefined: Self = StObject.set(x, "CACertificateIdentifier", js.undefined)
    
    inline def setCopyTagsToSnapshot(value: BooleanOptional): Self = StObject.set(x, "CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "CopyTagsToSnapshot", js.undefined)
    
    inline def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceClassUndefined: Self = StObject.set(x, "DBInstanceClass", js.undefined)
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEnablePerformanceInsights(value: BooleanOptional): Self = StObject.set(x, "EnablePerformanceInsights", value.asInstanceOf[js.Any])
    
    inline def setEnablePerformanceInsightsUndefined: Self = StObject.set(x, "EnablePerformanceInsights", js.undefined)
    
    inline def setNewDBInstanceIdentifier(value: String): Self = StObject.set(x, "NewDBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setNewDBInstanceIdentifierUndefined: Self = StObject.set(x, "NewDBInstanceIdentifier", js.undefined)
    
    inline def setPerformanceInsightsKMSKeyId(value: String): Self = StObject.set(x, "PerformanceInsightsKMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setPerformanceInsightsKMSKeyIdUndefined: Self = StObject.set(x, "PerformanceInsightsKMSKeyId", js.undefined)
    
    inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    inline def setPromotionTier(value: IntegerOptional): Self = StObject.set(x, "PromotionTier", value.asInstanceOf[js.Any])
    
    inline def setPromotionTierUndefined: Self = StObject.set(x, "PromotionTier", js.undefined)
  }
}
