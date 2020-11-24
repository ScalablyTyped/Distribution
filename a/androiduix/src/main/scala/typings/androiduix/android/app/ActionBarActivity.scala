package typings.androiduix.android.app

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionBarActivity extends Activity {
  
  def getActionBar(): ActionBar = js.native
  
  /* private */ def initActionBar(): js.Any = js.native
  
  /* private */ def initDefaultBackFinish(): js.Any = js.native
  
  var mActionBar: js.Any = js.native
  
  def setActionBar(actionBar: ActionBar): Unit = js.native
}
