package typings.antDesignPro.anon

import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.GuideProps> */
trait ReadonlyGuideProps extends StObject {
  
  val children: js.UndefOr[ReactNode] = js.undefined
  
  val key: js.UndefOr[typings.react.mod.Key] = js.undefined
  
  val ref: js.UndefOr[LegacyRef[js.Any]] = js.undefined
}
object ReadonlyGuideProps {
  
  inline def apply(): ReadonlyGuideProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyGuideProps]
  }
  
  extension [Self <: ReadonlyGuideProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRef(value: LegacyRef[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
