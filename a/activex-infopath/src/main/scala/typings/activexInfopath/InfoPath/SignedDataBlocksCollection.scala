package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignedDataBlocksCollection extends StObject {
  
  val Count: Double = js.native
  
  @JSName("InfoPath.SignedDataBlocksCollection_typekey")
  var InfoPathDotSignedDataBlocksCollection_typekey: SignedDataBlocksCollection = js.native
  
  def Item(varIndex: js.Any): SignedDataBlockObject = js.native
}
object SignedDataBlocksCollection {
  
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotSignedDataBlocksCollection_typekey: SignedDataBlocksCollection,
    Item: js.Any => SignedDataBlockObject
  ): SignedDataBlocksCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.SignedDataBlocksCollection_typekey")(InfoPathDotSignedDataBlocksCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedDataBlocksCollection]
  }
  
  @scala.inline
  implicit class SignedDataBlocksCollectionMutableBuilder[Self <: SignedDataBlocksCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotSignedDataBlocksCollection_typekey(value: SignedDataBlocksCollection): Self = StObject.set(x, "InfoPath.SignedDataBlocksCollection_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => SignedDataBlockObject): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
