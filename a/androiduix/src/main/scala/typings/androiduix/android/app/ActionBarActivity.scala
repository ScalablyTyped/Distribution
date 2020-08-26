package typings.androiduix.android.app

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionBarActivity extends Activity {
  var mActionBar: js.Any = js.native
  def getActionBar(): ActionBar = js.native
  /* private */ def initActionBar(): js.Any = js.native
  /* private */ def initDefaultBackFinish(): js.Any = js.native
  def setActionBar(actionBar: ActionBar): Unit = js.native
}

