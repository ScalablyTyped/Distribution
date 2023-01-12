package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrawlerTargets extends StObject {
  
  /**
    * Specifies Glue Data Catalog targets.
    */
  var CatalogTargets: js.UndefOr[CatalogTargetList] = js.undefined
  
  /**
    * Specifies Delta data store targets.
    */
  var DeltaTargets: js.UndefOr[DeltaTargetList] = js.undefined
  
  /**
    * Specifies Amazon DynamoDB targets.
    */
  var DynamoDBTargets: js.UndefOr[DynamoDBTargetList] = js.undefined
  
  /**
    * Specifies JDBC targets.
    */
  var JdbcTargets: js.UndefOr[JdbcTargetList] = js.undefined
  
  /**
    * Specifies Amazon DocumentDB or MongoDB targets.
    */
  var MongoDBTargets: js.UndefOr[MongoDBTargetList] = js.undefined
  
  /**
    * Specifies Amazon Simple Storage Service (Amazon S3) targets.
    */
  var S3Targets: js.UndefOr[S3TargetList] = js.undefined
}
object CrawlerTargets {
  
  inline def apply(): CrawlerTargets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrawlerTargets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrawlerTargets] (val x: Self) extends AnyVal {
    
    inline def setCatalogTargets(value: CatalogTargetList): Self = StObject.set(x, "CatalogTargets", value.asInstanceOf[js.Any])
    
    inline def setCatalogTargetsUndefined: Self = StObject.set(x, "CatalogTargets", js.undefined)
    
    inline def setCatalogTargetsVarargs(value: CatalogTarget*): Self = StObject.set(x, "CatalogTargets", js.Array(value*))
    
    inline def setDeltaTargets(value: DeltaTargetList): Self = StObject.set(x, "DeltaTargets", value.asInstanceOf[js.Any])
    
    inline def setDeltaTargetsUndefined: Self = StObject.set(x, "DeltaTargets", js.undefined)
    
    inline def setDeltaTargetsVarargs(value: DeltaTarget*): Self = StObject.set(x, "DeltaTargets", js.Array(value*))
    
    inline def setDynamoDBTargets(value: DynamoDBTargetList): Self = StObject.set(x, "DynamoDBTargets", value.asInstanceOf[js.Any])
    
    inline def setDynamoDBTargetsUndefined: Self = StObject.set(x, "DynamoDBTargets", js.undefined)
    
    inline def setDynamoDBTargetsVarargs(value: DynamoDBTarget*): Self = StObject.set(x, "DynamoDBTargets", js.Array(value*))
    
    inline def setJdbcTargets(value: JdbcTargetList): Self = StObject.set(x, "JdbcTargets", value.asInstanceOf[js.Any])
    
    inline def setJdbcTargetsUndefined: Self = StObject.set(x, "JdbcTargets", js.undefined)
    
    inline def setJdbcTargetsVarargs(value: JdbcTarget*): Self = StObject.set(x, "JdbcTargets", js.Array(value*))
    
    inline def setMongoDBTargets(value: MongoDBTargetList): Self = StObject.set(x, "MongoDBTargets", value.asInstanceOf[js.Any])
    
    inline def setMongoDBTargetsUndefined: Self = StObject.set(x, "MongoDBTargets", js.undefined)
    
    inline def setMongoDBTargetsVarargs(value: MongoDBTarget*): Self = StObject.set(x, "MongoDBTargets", js.Array(value*))
    
    inline def setS3Targets(value: S3TargetList): Self = StObject.set(x, "S3Targets", value.asInstanceOf[js.Any])
    
    inline def setS3TargetsUndefined: Self = StObject.set(x, "S3Targets", js.undefined)
    
    inline def setS3TargetsVarargs(value: S3Target*): Self = StObject.set(x, "S3Targets", js.Array(value*))
  }
}
