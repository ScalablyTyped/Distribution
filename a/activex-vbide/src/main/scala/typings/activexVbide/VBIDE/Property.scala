package typings.activexVbide.VBIDE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Property extends StObject {
  
  val Application: typings.activexVbide.VBIDE.Application = js.native
  
  def Collection(index: js.Any): Property = js.native
  @JSName("Collection")
  val Collection_Original: Properties = js.native
  
  def IndexedValue(Index1: js.Any): js.Any = js.native
  def IndexedValue(Index1: js.Any, Index2: js.Any): js.Any = js.native
  def IndexedValue(Index1: js.Any, Index2: js.Any, Index3: js.Any): js.Any = js.native
  def IndexedValue(Index1: js.Any, Index2: js.Any, Index3: js.Any, Index4: js.Any): js.Any = js.native
  def IndexedValue(Index1: js.Any, Index2: js.Any, Index3: Unit, Index4: js.Any): js.Any = js.native
  def IndexedValue(Index1: js.Any, Index2: Unit, Index3: js.Any): js.Any = js.native
  def IndexedValue(Index1: js.Any, Index2: Unit, Index3: js.Any, Index4: js.Any): js.Any = js.native
  def IndexedValue(Index1: js.Any, Index2: Unit, Index3: Unit, Index4: js.Any): js.Any = js.native
  
  val Name: String = js.native
  
  val NumIndices: Double = js.native
  
  var Object: js.Any = js.native
  
  def Parent(index: js.Any): Property = js.native
  @JSName("Parent")
  val Parent_Original: Properties = js.native
  
  val VBE: typings.activexVbide.VBIDE.VBE = js.native
  
  @JSName("VBIDE.Property_typekey")
  var VBIDEDotProperty_typekey: Property = js.native
  
  var Value: js.Any = js.native
}
