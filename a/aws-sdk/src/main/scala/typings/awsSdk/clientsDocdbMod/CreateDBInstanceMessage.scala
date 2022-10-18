package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBInstanceMessage extends StObject {
  
  /**
    * This parameter does not apply to Amazon DocumentDB. Amazon DocumentDB does not perform minor version upgrades regardless of the value set. Default: false 
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Amazon EC2 Availability Zone that the instance is created in.  Default: A random, system-chosen Availability Zone in the endpoint's Amazon Web Services Region. Example: us-east-1d 
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether to copy tags from the DB instance to snapshots of the DB instance. By default, tags are not copied.
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The identifier of the cluster that the instance will belong to.
    */
  var DBClusterIdentifier: String
  
  /**
    * The compute and memory capacity of the instance; for example, db.r5.large. 
    */
  var DBInstanceClass: String
  
  /**
    * The instance identifier. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: mydbinstance 
    */
  var DBInstanceIdentifier: String
  
  /**
    * A value that indicates whether to enable Performance Insights for the DB Instance. For more information, see Using Amazon Performance Insights.
    */
  var EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The name of the database engine to be used for this instance. Valid value: docdb 
    */
  var Engine: String
  
  /**
    * The KMS key identifier for encryption of Performance Insights data. The KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. If you do not specify a value for PerformanceInsightsKMSKeyId, then Amazon DocumentDB uses your default KMS key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a different default KMS key for each Amazon Web Services region.
    */
  var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The time range each week during which system maintenance can occur, in Universal Coordinated Time (UTC).  Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services Region, occurring on a random day of the week.  Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun Constraints: Minimum 30-minute window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after a failure of the existing primary instance. Default: 1 Valid values: 0-15
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The tags to be assigned to the instance. You can assign up to 10 tags to an instance.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateDBInstanceMessage {
  
  inline def apply(DBClusterIdentifier: String, DBInstanceClass: String, DBInstanceIdentifier: String, Engine: String): CreateDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], DBInstanceClass = DBInstanceClass.asInstanceOf[js.Any], DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBInstanceMessage]
  }
  
  extension [Self <: CreateDBInstanceMessage](x: Self) {
    
    inline def setAutoMinorVersionUpgrade(value: BooleanOptional): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setCopyTagsToSnapshot(value: BooleanOptional): Self = StObject.set(x, "CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "CopyTagsToSnapshot", js.undefined)
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEnablePerformanceInsights(value: BooleanOptional): Self = StObject.set(x, "EnablePerformanceInsights", value.asInstanceOf[js.Any])
    
    inline def setEnablePerformanceInsightsUndefined: Self = StObject.set(x, "EnablePerformanceInsights", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setPerformanceInsightsKMSKeyId(value: String): Self = StObject.set(x, "PerformanceInsightsKMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setPerformanceInsightsKMSKeyIdUndefined: Self = StObject.set(x, "PerformanceInsightsKMSKeyId", js.undefined)
    
    inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    inline def setPromotionTier(value: IntegerOptional): Self = StObject.set(x, "PromotionTier", value.asInstanceOf[js.Any])
    
    inline def setPromotionTierUndefined: Self = StObject.set(x, "PromotionTier", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
