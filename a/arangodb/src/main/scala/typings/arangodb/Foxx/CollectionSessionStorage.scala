package typings.arangodb.Foxx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionSessionStorage
  extends StObject
     with SessionStorage {
  
  def clear(session: Session): Boolean
  
  @JSName("new")
  def new_MCollectionSessionStorage(): Session
  
  def prune(): js.Array[String]
  
  def save(session: Session): Session
}
object CollectionSessionStorage {
  
  inline def apply(
    clear: Session => Boolean,
    forClient: Session => String | Null,
    fromClient: String => Session | Null,
    `new`: () => Session,
    prune: () => js.Array[String],
    save: Session => Session
  ): CollectionSessionStorage = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), forClient = js.Any.fromFunction1(forClient), fromClient = js.Any.fromFunction1(fromClient), prune = js.Any.fromFunction0(prune), save = js.Any.fromFunction1(save))
    __obj.updateDynamic("new")(js.Any.fromFunction0(`new`))
    __obj.asInstanceOf[CollectionSessionStorage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectionSessionStorage] (val x: Self) extends AnyVal {
    
    inline def setClear(value: Session => Boolean): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
    
    inline def setNew(value: () => Session): Self = StObject.set(x, "new", js.Any.fromFunction0(value))
    
    inline def setPrune(value: () => js.Array[String]): Self = StObject.set(x, "prune", js.Any.fromFunction0(value))
    
    inline def setSave(value: Session => Session): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
  }
}
