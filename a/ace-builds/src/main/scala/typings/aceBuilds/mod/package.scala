package typings.aceBuilds.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def config: typings.aceBuilds.mod.Ace.Config = typings.aceBuilds.mod.^.asInstanceOf[js.Dynamic].selectDynamic("config").asInstanceOf[typings.aceBuilds.mod.Ace.Config]

@scala.inline
def createEditSession(text: java.lang.String, mode: typings.aceBuilds.mod.Ace.SyntaxMode): typings.aceBuilds.mod.Ace.EditSession = (typings.aceBuilds.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createEditSession")(text.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typings.aceBuilds.mod.Ace.EditSession]
@scala.inline
def createEditSession(text: typings.aceBuilds.mod.Ace.Document, mode: typings.aceBuilds.mod.Ace.SyntaxMode): typings.aceBuilds.mod.Ace.EditSession = (typings.aceBuilds.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createEditSession")(text.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typings.aceBuilds.mod.Ace.EditSession]

@scala.inline
def edit(el: java.lang.String): typings.aceBuilds.mod.Ace.Editor = typings.aceBuilds.mod.^.asInstanceOf[js.Dynamic].applyDynamic("edit")(el.asInstanceOf[js.Any]).asInstanceOf[typings.aceBuilds.mod.Ace.Editor]
@scala.inline
def edit(el: java.lang.String, options: typings.aceBuilds.anon.PartialEditorOptions): typings.aceBuilds.mod.Ace.Editor = (typings.aceBuilds.mod.^.asInstanceOf[js.Dynamic].applyDynamic("edit")(el.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.aceBuilds.mod.Ace.Editor]
@scala.inline
def edit(el: typings.std.Element): typings.aceBuilds.mod.Ace.Editor = typings.aceBuilds.mod.^.asInstanceOf[js.Dynamic].applyDynamic("edit")(el.asInstanceOf[js.Any]).asInstanceOf[typings.aceBuilds.mod.Ace.Editor]
@scala.inline
def edit(el: typings.std.Element, options: typings.aceBuilds.anon.PartialEditorOptions): typings.aceBuilds.mod.Ace.Editor = (typings.aceBuilds.mod.^.asInstanceOf[js.Dynamic].applyDynamic("edit")(el.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.aceBuilds.mod.Ace.Editor]

@scala.inline
def require(name: java.lang.String): js.Any = typings.aceBuilds.mod.^.asInstanceOf[js.Dynamic].applyDynamic("require")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]

@scala.inline
def version: java.lang.String = typings.aceBuilds.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
