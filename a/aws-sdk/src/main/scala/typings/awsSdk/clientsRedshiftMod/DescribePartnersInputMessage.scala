package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePartnersInputMessage extends StObject {
  
  /**
    * The Amazon Web Services account ID that owns the cluster.
    */
  var AccountId: PartnerIntegrationAccountId
  
  /**
    * The cluster identifier of the cluster whose partner integration is being described.
    */
  var ClusterIdentifier: PartnerIntegrationClusterIdentifier
  
  /**
    * The name of the database whose partner integration is being described. If database name is not specified, then all databases in the cluster are described.
    */
  var DatabaseName: js.UndefOr[PartnerIntegrationDatabaseName] = js.undefined
  
  /**
    * The name of the partner that is being described. If partner name is not specified, then all partner integrations are described.
    */
  var PartnerName: js.UndefOr[PartnerIntegrationPartnerName] = js.undefined
}
object DescribePartnersInputMessage {
  
  inline def apply(AccountId: PartnerIntegrationAccountId, ClusterIdentifier: PartnerIntegrationClusterIdentifier): DescribePartnersInputMessage = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePartnersInputMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePartnersInputMessage] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: PartnerIntegrationAccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifier(value: PartnerIntegrationClusterIdentifier): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDatabaseName(value: PartnerIntegrationDatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setPartnerName(value: PartnerIntegrationPartnerName): Self = StObject.set(x, "PartnerName", value.asInstanceOf[js.Any])
    
    inline def setPartnerNameUndefined: Self = StObject.set(x, "PartnerName", js.undefined)
  }
}
