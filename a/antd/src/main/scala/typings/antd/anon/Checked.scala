package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checked extends StObject {
  
  var checked: js.Array[typings.rcTree.esInterfaceMod.Key]
  
  var halfChecked: js.Array[typings.rcTree.esInterfaceMod.Key]
}
object Checked {
  
  inline def apply(
    checked: js.Array[typings.rcTree.esInterfaceMod.Key],
    halfChecked: js.Array[typings.rcTree.esInterfaceMod.Key]
  ): Checked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], halfChecked = halfChecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Checked] (val x: Self) extends AnyVal {
    
    inline def setChecked(value: js.Array[typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedVarargs(value: typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "checked", js.Array(value*))
    
    inline def setHalfChecked(value: js.Array[typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
    
    inline def setHalfCheckedVarargs(value: typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "halfChecked", js.Array(value*))
  }
}
