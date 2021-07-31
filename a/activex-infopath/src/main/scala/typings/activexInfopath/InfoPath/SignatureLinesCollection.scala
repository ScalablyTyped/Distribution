package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureLinesCollection extends StObject {
  
  val Count: Double
  
  @JSName("InfoPath.SignatureLinesCollection_typekey")
  var InfoPathDotSignatureLinesCollection_typekey: SignatureLinesCollection
  
  def Item(varIndex: js.Any): SignatureLineObject
}
object SignatureLinesCollection {
  
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotSignatureLinesCollection_typekey: SignatureLinesCollection,
    Item: js.Any => SignatureLineObject
  ): SignatureLinesCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.SignatureLinesCollection_typekey")(InfoPathDotSignatureLinesCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureLinesCollection]
  }
  
  @scala.inline
  implicit class SignatureLinesCollectionMutableBuilder[Self <: SignatureLinesCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotSignatureLinesCollection_typekey(value: SignatureLinesCollection): Self = StObject.set(x, "InfoPath.SignatureLinesCollection_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => SignatureLineObject): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
