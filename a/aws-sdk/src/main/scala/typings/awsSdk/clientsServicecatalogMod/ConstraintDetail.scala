package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstraintDetail extends StObject {
  
  /**
    * The identifier of the constraint.
    */
  var ConstraintId: js.UndefOr[Id] = js.undefined
  
  /**
    * The description of the constraint.
    */
  var Description: js.UndefOr[ConstraintDescription] = js.undefined
  
  /**
    * The owner of the constraint.
    */
  var Owner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The identifier of the portfolio the product resides in. The constraint applies only to the instance of the product that lives within this portfolio.
    */
  var PortfolioId: js.UndefOr[Id] = js.undefined
  
  /**
    * The identifier of the product the constraint applies to. Note that a constraint applies to a specific instance of a product within a certain portfolio.
    */
  var ProductId: js.UndefOr[Id] = js.undefined
  
  /**
    * The type of constraint.    LAUNCH     NOTIFICATION    STACKSET    TEMPLATE   
    */
  var Type: js.UndefOr[ConstraintType] = js.undefined
}
object ConstraintDetail {
  
  inline def apply(): ConstraintDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstraintDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConstraintDetail] (val x: Self) extends AnyVal {
    
    inline def setConstraintId(value: Id): Self = StObject.set(x, "ConstraintId", value.asInstanceOf[js.Any])
    
    inline def setConstraintIdUndefined: Self = StObject.set(x, "ConstraintId", js.undefined)
    
    inline def setDescription(value: ConstraintDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setOwner(value: AccountId): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setPortfolioId(value: Id): Self = StObject.set(x, "PortfolioId", value.asInstanceOf[js.Any])
    
    inline def setPortfolioIdUndefined: Self = StObject.set(x, "PortfolioId", js.undefined)
    
    inline def setProductId(value: Id): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "ProductId", js.undefined)
    
    inline def setType(value: ConstraintType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
