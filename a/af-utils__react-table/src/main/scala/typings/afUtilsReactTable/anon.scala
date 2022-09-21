package typings.afUtilsReactTable

import org.scalablytyped.runtime.Instantiable0
import typings.afUtilsReactTable.afUtilsReactTableStrings.Cell
import typings.afUtilsReactTable.afUtilsReactTableStrings.align
import typings.afUtilsReactTable.afUtilsReactTableStrings.background
import typings.afUtilsReactTable.afUtilsReactTableStrings.border
import typings.afUtilsReactTable.afUtilsReactTableStrings.format
import typings.afUtilsReactTable.afUtilsReactTableStrings.key
import typings.afUtilsReactTable.afUtilsReactTableStrings.label
import typings.afUtilsReactTable.afUtilsReactTableStrings.minWidth
import typings.afUtilsReactTable.afUtilsReactTableStrings.render
import typings.afUtilsReactTable.afUtilsReactTableStrings.width
import typings.afUtilsReactTable.mod.ColumnModel
import typings.afUtilsReactTable.mod.RowProps
import typings.afUtilsReactVirtualHeadless.mod.Model
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Columns extends StObject {
    
    var columns: js.Array[ColumnModel]
    
    var components: this.type
  }
  object Columns {
    
    inline def apply(columns: js.Array[ColumnModel], components: Columns): Columns = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any])
      __obj.asInstanceOf[Columns]
    }
    
    extension [Self <: Columns](x: Self) {
      
      inline def setColumns(value: js.Array[ColumnModel]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: ColumnModel*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setComponents(value: Columns): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: RowProps
    
    var i: Double
    
    var i2: Double
    
    var model: Model
  }
  object Data {
    
    inline def apply(data: RowProps, i: Double, i2: Double, model: Model): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], i2 = i2.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: RowProps): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setI2(value: Double): Self = StObject.set(x, "i2", value.asInstanceOf[js.Any])
      
      inline def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ref extends StObject {
    
    var ref: typings.react.mod.Ref[HTMLElement]
  }
  object Ref {
    
    inline def apply(): Ref = {
      val __obj = js.Dynamic.literal(ref = null)
      __obj.asInstanceOf[Ref]
    }
    
    extension [Self <: Ref](x: Self) {
      
      inline def setRef(value: typings.react.mod.Ref[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
  
  @js.native
  trait TypeofColumnModel
    extends StObject
       with Instantiable0[ColumnModel] {
    
    val KEYS: js.Tuple10[key, align, label, render, format, Cell, background, border, width, minWidth] = js.native
  }
}
