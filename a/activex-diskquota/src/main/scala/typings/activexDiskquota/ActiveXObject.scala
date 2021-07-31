package typings.activexDiskquota

import typings.activexDiskquota.DiskQuotaTypeLibrary.DiskQuotaControl
import typings.activexDiskquota.activexDiskquotaStrings.OnUserNameChanged
import typings.activexDiskquota.activexDiskquotaStrings.pUser
import typings.activexDiskquota.anon.PUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObject extends StObject {
  
  def on(
    obj: DiskQuotaControl,
    event: OnUserNameChanged,
    argNames: js.Array[pUser],
    handler: js.ThisFunction1[/* this */ DiskQuotaControl, /* parameter */ PUser, Unit]
  ): Unit
}
object ActiveXObject {
  
  @scala.inline
  def apply(
    on: (DiskQuotaControl, OnUserNameChanged, js.Array[pUser], js.ThisFunction1[/* this */ DiskQuotaControl, /* parameter */ PUser, Unit]) => Unit
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction4(on))
    __obj.asInstanceOf[ActiveXObject]
  }
  
  @scala.inline
  implicit class ActiveXObjectMutableBuilder[Self <: ActiveXObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOn(
      value: (DiskQuotaControl, OnUserNameChanged, js.Array[pUser], js.ThisFunction1[/* this */ DiskQuotaControl, /* parameter */ PUser, Unit]) => Unit
    ): Self = StObject.set(x, "on", js.Any.fromFunction4(value))
  }
}
