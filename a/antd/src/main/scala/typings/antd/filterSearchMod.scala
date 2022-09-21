package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.tableInterfaceMod.FilterSearchType
import typings.antd.tableInterfaceMod.TableLocale
import typings.react.mod.ChangeEvent
import typings.react.mod.FC
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterSearchMod extends Shortcut {
  
  @JSImport("antd/lib/table/hooks/useFilter/FilterSearch", JSImport.Default)
  @js.native
  val default: FC[FilterSearchProps] = js.native
  
  trait FilterSearchProps extends StObject {
    
    var filterSearch: FilterSearchType
    
    var locale: TableLocale
    
    def onChange(e: ChangeEvent[HTMLInputElement]): Unit
    
    var tablePrefixCls: String
    
    var value: String
  }
  object FilterSearchProps {
    
    inline def apply(
      filterSearch: FilterSearchType,
      locale: TableLocale,
      onChange: ChangeEvent[HTMLInputElement] => Unit,
      tablePrefixCls: String,
      value: String
    ): FilterSearchProps = {
      val __obj = js.Dynamic.literal(filterSearch = filterSearch.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), tablePrefixCls = tablePrefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterSearchProps]
    }
    
    extension [Self <: FilterSearchProps](x: Self) {
      
      inline def setFilterSearch(value: FilterSearchType): Self = StObject.set(x, "filterSearch", value.asInstanceOf[js.Any])
      
      inline def setFilterSearchFunction2(value: (/* input */ String, /* record */ js.Object) => Boolean): Self = StObject.set(x, "filterSearch", js.Any.fromFunction2(value))
      
      inline def setLocale(value: TableLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setTablePrefixCls(value: String): Self = StObject.set(x, "tablePrefixCls", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[FilterSearchProps]
  
  /* This means you don't have to write `default`, but can instead just say `filterSearchMod.foo` */
  override def _to: FC[FilterSearchProps] = default
}
