package typings.agGrid

import typings.agGrid.iRowModelMod.IRowModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iServerSideRowModelMod {
  
  @js.native
  trait IServerSideRowModel extends IRowModel {
    
    def addToCache(route: js.Array[String], items: js.Array[_], index: Double): Unit = js.native
    
    def getBlockState(): js.Any = js.native
    
    def purgeCache(): Unit = js.native
    def purgeCache(route: js.Array[String]): Unit = js.native
    
    def removeFromCache(route: js.Array[String], items: js.Array[_]): Unit = js.native
  }
}
