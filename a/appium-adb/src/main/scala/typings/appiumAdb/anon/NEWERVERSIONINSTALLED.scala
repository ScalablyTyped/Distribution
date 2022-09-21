package typings.appiumAdb.anon

import typings.appiumAdb.appiumAdbStrings.newerVersionInstalled
import typings.appiumAdb.appiumAdbStrings.notInstalled
import typings.appiumAdb.appiumAdbStrings.olderVersionInstalled
import typings.appiumAdb.appiumAdbStrings.sameVersionInstalled
import typings.appiumAdb.appiumAdbStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEWERVERSIONINSTALLED extends StObject {
  
  var NEWER_VERSION_INSTALLED: newerVersionInstalled
  
  var NOT_INSTALLED: notInstalled
  
  var OLDER_VERSION_INSTALLED: olderVersionInstalled
  
  var SAME_VERSION_INSTALLED: sameVersionInstalled
  
  var UNKNOWN: unknown
}
object NEWERVERSIONINSTALLED {
  
  inline def apply(): NEWERVERSIONINSTALLED = {
    val __obj = js.Dynamic.literal(NEWER_VERSION_INSTALLED = "newerVersionInstalled", NOT_INSTALLED = "notInstalled", OLDER_VERSION_INSTALLED = "olderVersionInstalled", SAME_VERSION_INSTALLED = "sameVersionInstalled", UNKNOWN = "unknown")
    __obj.asInstanceOf[NEWERVERSIONINSTALLED]
  }
  
  extension [Self <: NEWERVERSIONINSTALLED](x: Self) {
    
    inline def setNEWER_VERSION_INSTALLED(value: newerVersionInstalled): Self = StObject.set(x, "NEWER_VERSION_INSTALLED", value.asInstanceOf[js.Any])
    
    inline def setNOT_INSTALLED(value: notInstalled): Self = StObject.set(x, "NOT_INSTALLED", value.asInstanceOf[js.Any])
    
    inline def setOLDER_VERSION_INSTALLED(value: olderVersionInstalled): Self = StObject.set(x, "OLDER_VERSION_INSTALLED", value.asInstanceOf[js.Any])
    
    inline def setSAME_VERSION_INSTALLED(value: sameVersionInstalled): Self = StObject.set(x, "SAME_VERSION_INSTALLED", value.asInstanceOf[js.Any])
    
    inline def setUNKNOWN(value: unknown): Self = StObject.set(x, "UNKNOWN", value.asInstanceOf[js.Any])
  }
}
