package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignaturesCollection extends StObject {
  
  val Count: Double
  
  def Create(): SignatureObject
  
  /* private */ @JSName("InfoPath.SignaturesCollection_typekey")
  var InfoPathDotSignaturesCollection_typekey: SignaturesCollection
  
  def Item(varIndex: js.Any): SignatureObject
}
object SignaturesCollection {
  
  inline def apply(
    Count: Double,
    Create: () => SignatureObject,
    InfoPathDotSignaturesCollection_typekey: SignaturesCollection,
    Item: js.Any => SignatureObject
  ): SignaturesCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Create = js.Any.fromFunction0(Create), Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.SignaturesCollection_typekey")(InfoPathDotSignaturesCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignaturesCollection]
  }
  
  extension [Self <: SignaturesCollection](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreate(value: () => SignatureObject): Self = StObject.set(x, "Create", js.Any.fromFunction0(value))
    
    inline def setInfoPathDotSignaturesCollection_typekey(value: SignaturesCollection): Self = StObject.set(x, "InfoPath.SignaturesCollection_typekey", value.asInstanceOf[js.Any])
    
    inline def setItem(value: js.Any => SignatureObject): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
